package com.scarebay4444.dao;

import java.util.List;

import com.scarebay4444.dao.GenericDAO;
import com.scarebay4444.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}


