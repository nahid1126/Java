package com.nasim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nasim.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
  
	List<String> findByName(String username);
	Role findById(int id);

}
