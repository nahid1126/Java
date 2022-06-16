package com.nasim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nasim.model.Employee_information;
import com.nasim.model.LeaveRequest;
import com.nasim.repository.LeaveRequestRepository;

@Service
public class LeaveService {
	@Autowired
	private LeaveRequestRepository leaveRequest;

	public void save(LeaveRequest leave) {
		leaveRequest.save(leave);
	}

	public Page<LeaveRequest> allleaveRequest(Pageable page) {
		return leaveRequest.findAll(page);

	}
	
	public LeaveRequest getLeaveRequestOnId(int id) {
		LeaveRequest result = leaveRequest.findById(id).get();
		return result;
	    }
	
	
	public Page<LeaveRequest> allLeaveStatus(Pageable page){
		return leaveRequest.findAll(page);
	}
	
	public Page<LeaveRequest>findallByAcceptRejectFlags(Pageable page,String name){
		return leaveRequest.findAllByAcceptRejectFlagLike(page,"%"+name+"%");
	}
	
	public List<LeaveRequest> userFindByUserName(String username) {
		return leaveRequest.findAllByUsersUsernameLike("%"+username+"%");
		
	}
	
	public List<LeaveRequest> GetAlluserRoleName(String rolename) {
		return leaveRequest.findAllByUsersRolesName(rolename);
		
	}
}
