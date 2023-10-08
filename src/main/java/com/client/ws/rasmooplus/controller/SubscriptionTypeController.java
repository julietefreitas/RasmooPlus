package com.client.ws.rasmooplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.ws.rasmooplus.entity.SubscriptionType;
import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.service.SubscriptionTypeService;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

	@Autowired
	private SubscriptionTypeService subTypeService;;

	@GetMapping("")
	public ResponseEntity<List<SubscriptionType>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(subTypeService.findAll());

	}

	@GetMapping("/{id}")
	public ResponseEntity<SubscriptionType> findById(@PathVariable("id") Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(subTypeService.findById(id));

		} catch (NotFoundException n) {

			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

}
