package com.scarebay4444.dao;

import java.util.List;

import com.scarebay4444.dao.GenericDAO;
import com.scarebay4444.domain.ItemCategory;





public interface ItemCategoryDAO extends GenericDAO<ItemCategory, Integer> {
  
	List<ItemCategory> findAll();
	






}


