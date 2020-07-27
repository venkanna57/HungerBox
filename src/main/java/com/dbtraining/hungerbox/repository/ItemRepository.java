package com.dbtraining.hungerbox.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbtraining.hungerbox.entity.Item;
import com.dbtraining.hungerbox.entity.Vender;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{


	List<Item> findByItemNameContains(String itemName);

	List<Item> findByItemNameContainsAndVender(String itemName, Vender vender);

	List<Item> findByVender(Vender vender);

	Optional<Item> findByItemName(String itemName);

}
