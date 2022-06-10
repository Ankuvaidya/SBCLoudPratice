package com.ankita.user.service.controller.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ankita.user.service.entity.User;
@Repository
public interface UserRepo  extends JpaRepository<User, Long>{

	User findByUserId(Long userId);


}
