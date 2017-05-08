package com.xav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.xav.bean.LoggingUser;
import com.xav.bean.User;
import com.xav.service.UserService;
/**
 * 
 * @author MD Shahid
 *
 */
@Service
public class LoggingUserDetailService implements UserDetailsService{

	private final UserService userService;

	@Autowired
	public LoggingUserDetailService(UserService userService) {
		this.userService = userService;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub

		User user = userService.getUserByEmail(username).orElseThrow(() -> new UsernameNotFoundException(String.format("User with email=%s was not found", username)));;
		return new LoggingUser(user);
	}

}
