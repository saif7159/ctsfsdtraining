package com.example.demo.service;



import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.shared.SharedUser;
@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {
	private UserDao udao;
	private ModelMapper modelMapper;
	{

		modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

	}
	@Autowired
	public UserServiceImpl(UserDao udao) {
		super();
		this.udao = udao;
	}

	@Override
	@Transactional
	public SharedUser createUser(User user) {
		User tuser = udao.save(user);
		return modelMapper.map(tuser, SharedUser.class);
		
	}

	@Override
	@Transactional
	public SharedUser findByID(int id) {
		
		return modelMapper.map(udao.findById(id), SharedUser.class);
	}


}
