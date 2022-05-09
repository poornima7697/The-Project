package com.example.demo.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Employee.Entity.User;

@Repository
public interface UserReplository extends JpaRepository<User, Integer>{
	
	@Query("Select a from User a where a.ait_id=?1")
	public User findByAit_id(String ait_id);


}
