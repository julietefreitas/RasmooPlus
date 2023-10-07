package com.client.ws.rasmooplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.ws.rasmooplus.entity.UserPaymentInfo;

public interface UserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Long> {

}
