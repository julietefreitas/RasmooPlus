package com.client.ws.rasmooplus.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_payment_info")
public class UserPaymentInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_payment_info_id")
	private Long id;
	
	@Column(name="card_number")
	private String cardNumber;
	
	@Column(name="card_expiration_month")
	private Long cardExpirationMonth;
	
	@Column(name="card_expiration_year")
	private Long cardExpirationYear;
	
	@Column(name="card_security_code")
	private Long cardSecurityCode;
	
	private BigDecimal price;
	
	private Long instalments;
	
	@Column(name="dt_payment")
	private LocalDate dataPayment;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;

	public UserPaymentInfo() {
		// TODO Auto-generated constructor stub
	}

	public UserPaymentInfo(Long id, String cardNumber, Long cardExpirationMonth, Long cardExpirationYear,
			Long cardSecurityCode, BigDecimal price, Long instalments, LocalDate dataPayment, User user) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.cardExpirationMonth = cardExpirationMonth;
		this.cardExpirationYear = cardExpirationYear;
		this.cardSecurityCode = cardSecurityCode;
		this.price = price;
		this.instalments = instalments;
		this.dataPayment = dataPayment;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Long getCardExpirationMonth() {
		return cardExpirationMonth;
	}

	public void setCardExpirationMonth(Long cardExpirationMonth) {
		this.cardExpirationMonth = cardExpirationMonth;
	}

	public Long getCardExpirationYear() {
		return cardExpirationYear;
	}

	public void setCardExpirationYear(Long cardExpirationYear) {
		this.cardExpirationYear = cardExpirationYear;
	}

	public Long getCardSecurityCode() {
		return cardSecurityCode;
	}

	public void setCardSecurityCode(Long cardSecurityCode) {
		this.cardSecurityCode = cardSecurityCode;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getInstalments() {
		return instalments;
	}

	public void setInstalments(Long instalments) {
		this.instalments = instalments;
	}

	public LocalDate getDataPayment() {
		return dataPayment;
	}

	public void setDataPayment(LocalDate dataPayment) {
		this.dataPayment = dataPayment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	

}
