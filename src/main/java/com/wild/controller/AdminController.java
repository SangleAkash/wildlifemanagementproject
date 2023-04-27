package com.wild.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.wild.entity.Admin;
import com.wild.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	AdminService as;

	@PostMapping(value = "/login")
	public boolean login(@RequestBody Admin admin) {
		boolean islogin = as.login(admin);
		return islogin;
	}

	@PostMapping(value = "/resister")
	public boolean register(@RequestBody Admin admin) {
		boolean register = as.register(admin);
		return register;
	}

	@DeleteMapping(value = "/delete/{ID}")
	public String deleteAdmin(@PathVariable String ID) {
		String deleteAdmin = as.deleteAdmin(ID);
		return deleteAdmin;
	}

	@PostMapping(value = "/update")
	public boolean updateProfile(Admin admin) {
		boolean updateProfile = as.updateProfile(admin);

		return updateProfile;
	}

	@GetMapping(value = "/logout")
	public boolean logOut() {
		return true;
	}

}
