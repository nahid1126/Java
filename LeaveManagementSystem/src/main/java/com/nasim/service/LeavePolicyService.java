package com.nasim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nasim.model.LeavePolicy;
import com.nasim.repository.LeavePolicyRepository;

@Service
public class LeavePolicyService {
	@Autowired
	private LeavePolicyRepository userpolicyRepo;

	// create a leave policies
	public void createLeavePolicy(LeavePolicy policy) {
		userpolicyRepo.save(policy);
	}
	
	// list of leave policy
	
	public Page<LeavePolicy>getAllLeavePolicy(Pageable page){
		return userpolicyRepo.findAll(page);
	}
}
