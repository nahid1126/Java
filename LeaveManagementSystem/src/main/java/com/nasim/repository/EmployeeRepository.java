package com.nasim.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nasim.model.Department;
import com.nasim.model.Employee_information;
import com.nasim.model.Role;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee_information, Integer> {
	public Page<Employee_information> findByDepartmentsNameLike(Pageable page, String name);

	Employee_information findByUsername(String username);
	Department findByDepartmentsId(int id);
	Role findByRolesId(int id);
}
