package com.nasim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nasim.model.LeaveRequest;
import com.nasim.model.Role;
import com.nasim.repository.LeaveRequestRepository;
import com.nasim.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository roleRepo;

	public void save(Role role) {
		roleRepo.save(role);
	}

	public List<Role> allRole() {
		return roleRepo.findAll();

	}

	public Role getRole(int id) {
		// TODO Auto-generated method stub
		return roleRepo.findById(id);
	}
}
