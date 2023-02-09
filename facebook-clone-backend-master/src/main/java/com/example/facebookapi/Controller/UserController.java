package com.example.facebookapi.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebookapi.Entity.User;
import com.example.facebookapi.Service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/userService")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save")
	public User saveUserMetaData(@RequestBody User user) {
		System.out.println(user.getUserName());
		return userService.submitMetaDataOfUser(user);
	}

	@GetMapping("/getUserDetails")
	public List<User> getAllUserDetails() {
		return userService.retrieveAllUserDetails();
	}

	@GetMapping("/getAllUsers/{userID}")
	public User getUserDetail(@PathVariable("userID") String userID) {
		return userService.getUserData(userID);
	}

}
