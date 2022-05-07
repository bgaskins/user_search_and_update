package com.caltechproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		private String name;
		private String email;
		private String address;
		
		public User() {
			super();
		}

		public User(Integer id,String name, String email, String address) {
			super();
			this.id= id;
			this.name = name;
			this.email = email;
			this.address = address;
		}

		public int getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
		}

}