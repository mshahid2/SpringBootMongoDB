package com.xav.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xav.bean.User;
import com.xav.repository.UserRepository;
import com.xav.service.UserService;
/**
 * 
 * @author MD Shahid
 *
 */
@Component
public class UserServiceImpl implements  UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public Optional<User> getUserByEmail(String strEmailID) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(strEmailID);
	}

	@Override
	public List<User> getUserByRole(String roleName) {
		// TODO Auto-generated method stub
		return userRepository.findByRole(roleName);
	}

}
