package com.mircoservice.demo;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mircoservice.demo.model.Item;
import com.mircoservice.demo.repository.ItemRepository;

@Component
public class ItemInitializer implements CommandLineRunner{
	
	@Autowired
	private ItemRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> repository.save(new Item(null,item)));
//.save(new Item(null, item
		repository.findAll().forEach(System.out::println);
		
	}


    
}
