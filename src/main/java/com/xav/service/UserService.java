package com.xav.service;

import java.util.List;
import java.util.Optional;

import com.xav.bean.User;
/**
 * 
 * @author MD Shahid
 *
 */
public interface UserService {

	Optional<User> getUserByEmail(String strEmailID);

	List<User> getUserByRole (String roleName);

}
