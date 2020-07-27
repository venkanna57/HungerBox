package com.dbtraining.hungerbox.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbtraining.hungerbox.entity.Vender;

@Repository
public interface VenderRepository extends JpaRepository<Vender, Integer>{

	Vender findByVenderNameContains(String venderName);

	Optional<Vender> findByVenderName(String venderName);

}
