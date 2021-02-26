package com.linsmediros.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linsmediros.workshopmongo.model.User;
import com.linsmediros.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository rep;
	
	public List <User> findAll(){	
		return  rep.findAll();
		 	
	}
	
	
	
	
	

}
