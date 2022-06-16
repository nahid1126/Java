package com.nasim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasim.model.LeavePolicy;

public interface LeavePolicyRepository extends JpaRepository<LeavePolicy, Integer> {

}
