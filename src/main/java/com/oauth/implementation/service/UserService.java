//package com.oauth.implementation.service;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class UserService {
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	//User findCustomerByEmail(String email);
//	
//	public Iterable<User> getAllUsers() {
//		return userRepository.findAll();
//	}
//
//	public User getUsersById(int id)   
//	{  
//	return userRepository.findById(id).get();  
//	}  
//	
//	public void saveOrUpdate(User user)   
//	{  
//		userRepository.save(user);  
//	}  
//	
//	public void delete(int id)   
//	{  
//		userRepository.deleteById(id);  
//	} 
//	
//	public void update(User user, int userid)   
//	{  
//		userRepository.save(user);  
//	}
//
//
//
//	
//		
//	
//}
