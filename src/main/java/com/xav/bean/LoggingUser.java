package com.xav.bean;

import org.springframework.security.core.authority.AuthorityUtils;
/**
 * 
 * @author MD Shahid
 *
 */
public class LoggingUser extends org.springframework.security.core.userdetails.User{

	private static final long serialVersionUID = 1L;

	private User user;

	public LoggingUser(User user) {
		super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole()));
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public String getId() {
		return user.getId();
	}

	public String getRole() {
		return user.getRole();
	}

	@Override
	public String toString() {
		return "CurrentUser{" +
				"user=" + user +
				"} " + super.toString();
	}

}
