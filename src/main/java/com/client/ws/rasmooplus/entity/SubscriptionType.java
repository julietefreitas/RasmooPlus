package com.client.ws.rasmooplus.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscriptions_type")
public class SubscriptionType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subscriptions_type_id")
	private Long id;

	private String name;

	@Column(name = "access_months")
	private Long accessMonths;

	private BigDecimal price;

	@Column(name = "product_key")
	private String productKey;

	public SubscriptionType() {

	}

	public SubscriptionType(Long id, String name, Long accessMonths, BigDecimal price, String productKey) {
		super();
		this.id = id;
		this.name = name;
		this.accessMonths = accessMonths;
		this.price = price;
		this.productKey = productKey;
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

	public Long getAccessMonths() {
		return accessMonths;
	}

	public void setAccessMonths(Long accessMonths) {
		this.accessMonths = accessMonths;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getProductKey() {
		return productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	
	

}
