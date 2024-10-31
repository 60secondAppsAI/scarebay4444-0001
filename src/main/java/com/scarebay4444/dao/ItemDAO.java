package com.scarebay4444.dao;

import java.util.List;

import com.scarebay4444.dao.GenericDAO;
import com.scarebay4444.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


