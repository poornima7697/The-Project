package com.example.demo.Employee.Controller;

import java.util.ArrayList;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee.Entity.User;
import com.example.demo.Employee.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getall")
	public List<User> getList() {
		return userService.getall();
	}
	
	@GetMapping("/User/{id}") 
	public User getUserById(@PathVariable String id) 
	{ 
		return userService.findByAit_id(id); 
	}
	
	
	/* to get all Employee Right method */
	@GetMapping(value = "/getEmp")
	public List<com.example.demo.View.UserView>getAll1() {

        List<User> list = null;
        List<com.example.demo.View.UserView> list1 =  new ArrayList<>();

        list = userService.getall();

        list.forEach(e -> {
            list1.add(new com.example.demo.View.UserView(e.getFirst_name(), e.getLast_name(), e.getDesignation(), e.getAit_email(),
                    e.getContact_number()));
        });

        return list1;
    }
}

