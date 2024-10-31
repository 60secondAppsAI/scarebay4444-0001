package com.scarebay4444.dao;

import java.util.List;

import com.scarebay4444.dao.GenericDAO;
import com.scarebay4444.domain.Auction;





public interface AuctionDAO extends GenericDAO<Auction, Integer> {
  
	List<Auction> findAll();
	






}


