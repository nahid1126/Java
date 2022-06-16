package com.nasim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nasim.model.Department;
import com.nasim.model.Employee_information;
import com.nasim.model.Role;
import com.nasim.repository.DepartmentRepository;
import com.nasim.repository.EmployeeRepository;

@Service
public class EmployeeInformationService {
	@Autowired
	private EmployeeRepository empRepository;

	public void createUser(Employee_information user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		empRepository.save(user);
	}

	
	 public Page<Employee_information> allUserbyDepartmentname(Pageable page,
	  String name) { return empRepository.findByDepartmentsNameLike(page, "%" +
	  name + "%");
	  
	  }
	 
	
	public Employee_information getEmployeeOnId(int id) {
		Employee_information emp=empRepository.findById(id).get();
		return emp;
	}

	public void deleteUser(int id) {
		empRepository.deleteById(id);
	}
	

	public Employee_information UserInfo(String username) {

		return empRepository.findByUsername(username);
	}

	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		return empRepository.findByDepartmentsId(id);
	}
	
	public Role getRole(int id) {
		// TODO Auto-generated method stub
		return empRepository.findByRolesId(id);
	}
}
