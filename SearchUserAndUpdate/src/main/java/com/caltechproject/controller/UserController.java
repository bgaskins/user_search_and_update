package com.caltechproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.caltechproject.entity.User;
import com.caltechproject.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping(path="/users")
	public String showUsers(ModelMap model) {
		logger.info("Getting users");
		Iterable<User> users = userService.GetAllUsers();
		logger.info("Display users");
		model.addAttribute("users", users);
		return "users";
	}
	 
	@RequestMapping(value ="/search/{id}", method = RequestMethod.POST)
	public String searchUser(ModelMap model, @RequestParam("id") int id) {
		logger.info("Search for users");
		User user = userService.GetUserById(id);
		logger.info("Display users");
		model.addAttribute("userSearch", user);
		return "search";
	}

	@PostMapping("search/update")
	public String updateUser(ModelMap model, @ModelAttribute("update") User user) {
		logger.info("Updating a User");
		userService.UpdateUser(user);
		model.addAttribute("updatedUser", user);
		return "userupdate";
	}
}
