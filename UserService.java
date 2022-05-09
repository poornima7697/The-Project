package com.example.demo.Employee.Service;

import java.util.List;

import com.example.demo.Employee.Entity.User;

public interface UserService {
	

	public List<User> getall();
	
    //	public User getUser();
	//public List<User> getByAit_id(String id);

	public User findByAit_id(String id); 

}
