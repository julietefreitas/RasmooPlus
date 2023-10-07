package com.client.ws.rasmooplus.service;

import java.util.List;

import com.client.ws.rasmooplus.entity.SubscriptionType;


public interface SubscriptionTypeService {

	
	List<SubscriptionType> findAll();
	
	SubscriptionType findById(Long id);
	
	SubscriptionType create(SubscriptionType sub);
	
	SubscriptionType update(Long id);
	
	void delete(Long id);
}
