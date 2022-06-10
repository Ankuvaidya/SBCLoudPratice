package com.ankita.department.service.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankita.department.service.entity.Department;
import com.ankita.department.service.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepo departmentRepo;

	public Department saveDepartment(Department dept) {
		return departmentRepo.save(dept);
		
	}
	public Optional<Department> findByDepartmentId(Long id) {
		return departmentRepo.findByDepartmentId(id)	;	
		
	}
}
