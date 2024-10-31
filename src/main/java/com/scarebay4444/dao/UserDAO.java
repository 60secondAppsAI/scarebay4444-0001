package com.scarebay4444.dao;

import java.util.List;

import com.scarebay4444.dao.GenericDAO;
import com.scarebay4444.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


