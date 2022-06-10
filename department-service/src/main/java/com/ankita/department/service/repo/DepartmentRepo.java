package com.ankita.department.service.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankita.department.service.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

	Optional<Department> findByDepartmentId(Long id);



}
