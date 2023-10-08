package com.client.ws.rasmooplus.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.ws.rasmooplus.entity.SubscriptionType;
import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.repository.SubscriptionTypeRepository;
import com.client.ws.rasmooplus.service.SubscriptionTypeService;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService{
	
	@Autowired
	private SubscriptionTypeRepository subRepository;

	@Override
	public List<SubscriptionType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubscriptionType findById(Long id) {
		Optional<SubscriptionType> sub = subRepository.findById(id);
		
		if(sub.isEmpty()) {
			throw new NotFoundException("Não encontrado");
		}
		return sub.get();
	}

	@Override
	public SubscriptionType create(SubscriptionType sub) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubscriptionType update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
