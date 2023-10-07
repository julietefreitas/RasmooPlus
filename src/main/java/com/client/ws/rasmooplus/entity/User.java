package com.client.ws.rasmooplus.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="users_id")
	private Long id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String cpf;
	
	@Column(name="dt_subscription")
	private LocalDate dataSubscription = LocalDate.now();
	
	@Column(name="dt_expiration")
	private LocalDate dataExpiration;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_type_id")
	private UserType userType;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="subscription_type_id")
	private SubscriptionType subscriptionType;


	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(Long id, String name, String email, String phone, String cpf, LocalDate dataSubscription,
			LocalDate dataExpiration, UserType userType, SubscriptionType subscriptionType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.cpf = cpf;
		this.dataSubscription = dataSubscription;
		this.dataExpiration = dataExpiration;
		this.userType = userType;
		this.subscriptionType = subscriptionType;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public LocalDate getDataSubscription() {
		return dataSubscription;
	}


	public void setDataSubscription(LocalDate dataSubscription) {
		this.dataSubscription = dataSubscription;
	}


	public LocalDate getDataExpiration() {
		return dataExpiration;
	}


	public void setDataExpiration(LocalDate dataExpiration) {
		this.dataExpiration = dataExpiration;
	}


	public UserType getUserType() {
		return userType;
	}


	public void setUserType(UserType userType) {
		this.userType = userType;
	}


	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}


	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	
	
	
	
	
	
	

}
