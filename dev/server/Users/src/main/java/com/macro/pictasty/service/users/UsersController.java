package com.macro.pictasty.service.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
	
    @Autowired
    private UserRepository reservationRepo;
    

    @RequestMapping("/users/{id}")
    public List<User> findUser(
    		final @RequestParam(defaultValue = "0", required = false) int page,
     	    final @RequestParam(defaultValue = "10", required = false) int pageSize,
     	    @PathVariable(value="id") Integer id) {
    	Pageable topTen = new PageRequest(page, pageSize);
    	List<User> entities = reservationRepo.findById(id,topTen);
        return entities;
    }
    
    @RequestMapping("/users")
    public Page<User> findAllUsers(
    		final @RequestParam(defaultValue = "0", required = false) int page,
     	    final @RequestParam(defaultValue = "10", required = false) int pageSize) { 
    	Pageable pager = new PageRequest(page, pageSize);
    	Page<User> entities = reservationRepo.findAll(pager);
        return entities;
    }
}
