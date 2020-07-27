package com.dbtraining.hungerbox.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbtraining.hungerbox.dto.ItemResponseDto;
import com.dbtraining.hungerbox.exception.RequestNotFoundException;
import com.dbtraining.hungerbox.service.HungerBoxService;

/**
 * 
 * @author Rajesh R
 * @since 24-07-2020
 *
 */

@RestController
@RequestMapping("/orders")
public class HungerBoxController {
	private static Logger logger = LoggerFactory.getLogger(HungerBoxController.class);
	
	@Autowired
	HungerBoxService hungerBoxService;
	
	/**
	 * This method takes itemName and venderName or any one parameter to give list of items
	 * @param itemName accept String Value type
	 * @param venderName  accept String Value type
	 * @return ItemResponseDto
	 * @throws RequestNotFoundException if not request is not present in database throws exception
	 */
	@GetMapping("")
	public ItemResponseDto SearchItems(@Valid @RequestParam (value = "itemName",required = false) String itemName,@Valid @RequestParam (value = "venderName",required = false) String venderName) throws RequestNotFoundException {
		logger.info("In HungerBoxController Searchitems ");
		return hungerBoxService.SearchItems(itemName, venderName);
	}

}
