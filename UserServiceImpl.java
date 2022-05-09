package com.example.demo.Employee.Service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Employee.Entity.User;
import com.example.demo.Employee.Repository.UserReplository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserReplository userrepository;

	@Override
	public List<User> getall() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}

	@Override
	public User findByAit_id(String id) {
		// TODO Auto-generated method stub
		return userrepository.findByAit_id(id);
	}

//    @Override
//	public List<User> getByAit_id(String id) 
//	{ 
//    	
//    	return userrepository.findByAit_id(id); 
//  
//	}

	
	

}
