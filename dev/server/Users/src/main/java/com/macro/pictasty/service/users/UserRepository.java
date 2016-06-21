package com.macro.pictasty.service.users;


import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserRepository {
	List<User> findById(Integer id,Pageable pages);
	Page<User> findAll(Pageable pager);	
}