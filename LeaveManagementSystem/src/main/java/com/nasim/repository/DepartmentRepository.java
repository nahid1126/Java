package com.nasim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasim.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	 List<Department> findByName(String name);
	 Department findById(int id);
}
