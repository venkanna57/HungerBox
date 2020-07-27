package com.dbtraining.hungerbox.dto;

import java.util.ArrayList;
import java.util.List;

import com.dbtraining.hungerbox.entity.Item;

public class ItemResponseDto {
	
	private List<Item> items = new ArrayList<>();
	
	private String statusMessage;
	
	private Integer statusCode;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}


	
	

}
