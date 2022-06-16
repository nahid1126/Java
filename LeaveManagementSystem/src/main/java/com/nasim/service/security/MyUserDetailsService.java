package com.nasim.service.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nasim.model.Employee_information;
import com.nasim.model.Role;
import com.nasim.repository.EmployeeRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
@Autowired
	private EmployeeRepository empRepository;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub

		Employee_information user = empRepository.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("402");
		}
		 
		return new User(user.getUsername(),user.getPassword(),AuthorityUtils.createAuthorityList(user.getRoles().getName()));

	}
	

}
