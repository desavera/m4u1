package com.macro.pictasty.service.users;


import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class UserRepositoryMockImpl implements UserRepository {

	@Override
	public List<User> findById(Integer id, Pageable pages) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> findAll(Pageable pager) {
		// TODO Auto-generated method stub
		return null;
	}
	
}