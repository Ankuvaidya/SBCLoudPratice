package com.ankita.department.service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankita.department.service.entity.Department;
import com.ankita.department.service.services.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@PostMapping("/saveDept")
	public Department saveDepartment(@RequestBody Department dept) {
		log.info("inside saveDepartment controller");
		return departmentService.saveDepartment(dept);
	}

	@GetMapping("/findById/{id}")
	public Optional<Department> findByDepartmentId(@PathVariable Long id) {
		return departmentService.findByDepartmentId(id);
	}

	@GetMapping("/all")
	public String all() {
		return "hi";
	}
	

}
