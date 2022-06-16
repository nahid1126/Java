package com.nasim.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nasim.model.Employee_information;
import com.nasim.model.LeaveRequest;

public interface LeaveRequestRepository extends PagingAndSortingRepository<LeaveRequest, Integer> {
	Page<LeaveRequest> findAllByAcceptRejectFlagLike(Pageable page,String name);

	List<LeaveRequest> findByUsersUsername(String string);

	List<LeaveRequest> findAllByUsersUsernameLike(String username);
	
	List<LeaveRequest> findAllByUsersRolesName(String rolename);
}
