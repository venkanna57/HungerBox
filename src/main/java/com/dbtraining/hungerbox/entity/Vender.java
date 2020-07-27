package com.dbtraining.hungerbox.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Vender {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer venderId;
	@NotNull
	private String venderName;
	
	public Integer getVenderId() {
		return venderId;
	}

	public void setVenderId(Integer venderId) {
		this.venderId = venderId;
	}

	public String getVenderName() {
		return venderName;
	}

	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}
	
	

}
