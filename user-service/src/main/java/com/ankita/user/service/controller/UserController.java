package com.ankita.user.service.controller;

import com.ankita.user.service.VO.ResponseVO;
import com.ankita.user.service.entity.User;
import com.ankita.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/saveUser")

	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/userAndDepartment/{Id}")
	public ResponseVO getUserWithDepartment(@PathVariable(value="Id") Long userId) {
		return userService.getUserWithDepartment(userId);
	}

}
