package com.dbtraining.hungerbox.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.dbtraining.hungerbox.config.ApplicationConstant;
import com.dbtraining.hungerbox.dto.ItemResponseDto;
import com.dbtraining.hungerbox.entity.Item;
import com.dbtraining.hungerbox.entity.Vender;
import com.dbtraining.hungerbox.exception.RequestNotFoundException;
import com.dbtraining.hungerbox.repository.ItemRepository;
import com.dbtraining.hungerbox.repository.VenderRepository;

/**
 * 
 * @author Rajesh R
 *  @since 24-07-2020
 *
 */

@Service
public class HungerBoxService {
	private static Logger logger = LoggerFactory.getLogger(HungerBoxService.class);
	
	@Autowired
	VenderRepository venderRepository;
	
	@Autowired
	ItemRepository itemRepository;
	
//	public ItemResponseDto SearchItems(String itemName,String venderName) throws RequestNotFoundException {
//		logger.info("In HungerBoxService Searchitems ");
//		Optional<Item> item = itemRepository.findByItemName(itemName);
//		Optional<Vender> venderOptional = venderRepository.findByVenderName(venderName);
//		
//		if(item.isPresent()||venderOptional.isPresent()) {
//		ItemResponseDto itemResponseDto = new ItemResponseDto();
//		if(!StringUtils.isEmpty(itemName)) {
//			if(!StringUtils.isEmpty(venderName)) {
//				Vender vender = venderRepository.findByVenderNameContains(venderName);
//				List<Item> itemlist = itemRepository.findByItemNameContainsAndVender(itemName,vender);
//				itemResponseDto.setItems(itemlist);
//				itemResponseDto.setStatusCode(ApplicationConstant.STATUS_CODE_200);
//				itemResponseDto.setStatusMessage(ApplicationConstant.SUCCESS);
//				return itemResponseDto;
//				
//			}else {
//				List<Item> itemlist = itemRepository.findByItemNameContains(itemName);
//				itemResponseDto.setItems(itemlist);
//				itemResponseDto.setStatusCode(ApplicationConstant.STATUS_CODE_200);
//				itemResponseDto.setStatusMessage(ApplicationConstant.SUCCESS);
//				return itemResponseDto;
//			}
//			
//		}else if(!StringUtils.isEmpty(venderName)) {
//			Vender vender = venderRepository.findByVenderNameContains(venderName);
//			List<Item> itemlist = itemRepository.findByVender(vender);
//			itemResponseDto.setItems(itemlist);
//			itemResponseDto.setStatusCode(ApplicationConstant.STATUS_CODE_200);
//			itemResponseDto.setStatusMessage(ApplicationConstant.SUCCESS);
//			return itemResponseDto;
//		}else {
//			itemResponseDto.setStatusCode(ApplicationConstant.STATUS_CODE_404);
//			itemResponseDto.setStatusMessage(ApplicationConstant.REQUEST_FAILURE);
//			return itemResponseDto;
//		}
//		
//	}else
//		throw new RequestNotFoundException(ApplicationConstant.NO_ITEM_FOUND);
//	}
	
	public ItemResponseDto SearchItems(String itemName,String venderName) /*throws RequestNotFoundException*/ {
		logger.info("In HungerBoxService Searchitems ");
//		Optional<Item> item = itemRepository.findByItemName(itemName);
//		Optional<Vender> venderOptional = venderRepository.findByVenderName(venderName);
		
//		if(item.isPresent()||venderOptional.isPresent()) {
		ItemResponseDto itemResponseDto = new ItemResponseDto();
		if(!StringUtils.isEmpty(itemName)) {
			if(!StringUtils.isEmpty(venderName)) {
				Vender vender = venderRepository.findByVenderNameContains(venderName);
				List<Item> itemlist = itemRepository.findByItemNameContainsAndVender(itemName,vender);
				itemResponseDto.setItems(itemlist);
				itemResponseDto.setStatusCode(ApplicationConstant.STATUS_CODE_200);
				itemResponseDto.setStatusMessage(ApplicationConstant.SUCCESS);
				return itemResponseDto;
				
			}else {
				List<Item> itemlist = itemRepository.findByItemNameContains(itemName);
				itemResponseDto.setItems(itemlist);
				itemResponseDto.setStatusCode(ApplicationConstant.STATUS_CODE_200);
				itemResponseDto.setStatusMessage(ApplicationConstant.SUCCESS);
				return itemResponseDto;
			}
			
		}else if(!StringUtils.isEmpty(venderName)) {
			Vender vender = venderRepository.findByVenderNameContains(venderName);
			List<Item> itemlist = itemRepository.findByVender(vender);
			itemResponseDto.setItems(itemlist);
			itemResponseDto.setStatusCode(ApplicationConstant.STATUS_CODE_200);
			itemResponseDto.setStatusMessage(ApplicationConstant.SUCCESS);
			return itemResponseDto;
		}else {
			itemResponseDto.setStatusCode(ApplicationConstant.STATUS_CODE_404);
			itemResponseDto.setStatusMessage(ApplicationConstant.REQUEST_FAILURE);
			return itemResponseDto;
		}
		
//	}else
//		throw new RequestNotFoundException(ApplicationConstant.NO_ITEM_FOUND);
	}



}
