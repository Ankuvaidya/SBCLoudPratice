package com.ankita.user.service.services;

import com.ankita.user.service.VO.Department;
import com.ankita.user.service.VO.ResponseVO;
import com.ankita.user.service.controller.repo.*;
import com.ankita.user.service.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	@Autowired
	RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepo.save(user);
	}

	public ResponseVO getUserWithDepartment(Long userId) {
		// TODO Auto-generated method stub
		ResponseVO vo = new ResponseVO();
		User u = userRepo.findByUserId(userId);
		

		Department d = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/findById/" + u.getDepartmentId(),
				Department.class);
		vo.setUser(u);
		vo.setDepartment(d);
		return vo;
	}

}
