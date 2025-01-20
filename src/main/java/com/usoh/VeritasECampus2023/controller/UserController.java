package com.usoh.VeritasECampus2023.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.usoh.VeritasECampus2023.model.User;
import com.usoh.VeritasECampus2023.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String viewAllUsersPage(Model model) {
		List<User> users=service.getAllUsers();
		model.addAttribute("users", users);
		return "usersPage";
	}
	
	@GetMapping("/new")
	public String enterNewUserFormPage(Model model) {
		List<User> users=service.getAllUsers();
		model.addAttribute("users", users);
		return "newUserPage";
	}
	
	@PostMapping("/new")
	public String enterNewUserPage(@RequestParam String id, @RequestParam String fname, @RequestParam String lname, @RequestParam String phone, @RequestParam String password, @RequestParam String email, @RequestParam String gender, Model model) {
		User newUser=new User();
		newUser.setId(Integer.parseInt(id));
		newUser.setActive(false);
		newUser.setBlocked(false);
		newUser.setCreatedDate(LocalDateTime.now());
		newUser.setFname(fname);
		newUser.setLname(lname);
		newUser.setGender(gender);
		newUser.setPhone(Integer.parseInt(phone));
		newUser.setPassword(password);
		newUser.setPrivateEmail(email);
		service.createUser(newUser);
		List<User> users=service.getAllUsers();
		model.addAttribute("users", users);
		return "usersPage";
	}

}
