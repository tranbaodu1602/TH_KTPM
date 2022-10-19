package com.mircoservice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mircoservice.demo.model.Item;


@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long>{
	
}
