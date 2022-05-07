package com.caltechproject.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class WebAppErrorController implements ErrorController{

	@RequestMapping("/error")
    public String handleError() {
		return "error";
    }

    public String getErrorPath() {
        return null;
    }
}
