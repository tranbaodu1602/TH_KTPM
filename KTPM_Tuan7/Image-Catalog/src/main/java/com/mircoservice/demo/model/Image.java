package com.mircoservice.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;  
    private String title;  
    private String url;  
}
