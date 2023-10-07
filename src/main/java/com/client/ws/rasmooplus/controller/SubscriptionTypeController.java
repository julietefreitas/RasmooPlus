package com.client.ws.rasmooplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.ws.rasmooplus.entity.SubscriptionType;
import com.client.ws.rasmooplus.repository.SubscriptionTypeRepository;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {
	
	@Autowired
	private SubscriptionTypeRepository subscriptionRepository;
	
	
	public ResponseEntity<List<SubscriptionType>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(subscriptionRepository.findAll());
		
	}

}
