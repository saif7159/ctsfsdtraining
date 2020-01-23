package com.example.springhibernate_23_01_2020;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("service")
public class ServiceImpl implements UserService {
	@Autowired
	private UserDaoImpl userDaoImpl;

	@Override
	public UserDetail createUser(UserDetail detail) {
		
		return userDaoImpl.createUser(detail);
	}

}
