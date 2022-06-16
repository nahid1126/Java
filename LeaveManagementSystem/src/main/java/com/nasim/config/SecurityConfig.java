package com.nasim.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	

	@Autowired
	private DataSource dataSource;

	@Bean
	public PasswordEncoder passwordEncoder() {
		// TODO Auto-generated method stub
		return new BCryptPasswordEncoder();
	}

		@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		super.configure(auth);
		auth.jdbcAuthentication().dataSource(dataSource)
         .passwordEncoder(passwordEncoder());
	}

		
	 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		
		http .authorizeRequests().antMatchers("/static/**").permitAll();
		http .authorizeRequests().antMatchers("/createuser").hasRole("ADMIN");
		http .authorizeRequests().antMatchers("/viewUser").hasRole("ADMIN");
		http .authorizeRequests().antMatchers("/jsoncalendar").hasRole("ADMIN");
		http .authorizeRequests().antMatchers("/view_granteleave").hasRole("ADMIN");
		http .authorizeRequests().antMatchers("/leavepolicy").hasRole("ADMIN");
		http .authorizeRequests().antMatchers("/edit/**").hasRole("SUPERVISOR");
		http .authorizeRequests().antMatchers("/commentssuccess").hasRole("SUPERVISOR");
		http .authorizeRequests().antMatchers("/view_leave").hasRole("SUPERVISOR");
		http .authorizeRequests().antMatchers("/apply_leave").hasAnyRole("SUPERVISOR","USER");
		http .authorizeRequests().antMatchers("/leaveStatus").hasAnyRole("SUPERVISOR","USER");
		http .authorizeRequests().antMatchers("/calendar").hasAnyRole("SUPERVISOR","USER");
		http .authorizeRequests().antMatchers("/profile").hasAnyRole("SUPERVISOR","USER")
		.and().exceptionHandling().accessDeniedPage("/access-denied");
		
		 http.authorizeRequests()   
        .and()
        .formLogin()
            .loginPage("/login")
            .permitAll()
        .and()
        .logout()
            .invalidateHttpSession(true)
            .clearAuthentication(true)
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .logoutSuccessUrl("/login?logout")
            .permitAll();
            
	}

}
