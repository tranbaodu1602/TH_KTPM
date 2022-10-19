package com.mircoservice.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mircoservice.demo.model.Image;
import com.mircoservice.demo.service.ImageService;

@RestController  
@RequestMapping("/")
public class ImageController {
	@Autowired  
	private Environment env;  
	
	
	@Autowired
	private ImageService service;
	
	
	  @RequestMapping("/")  
	   public String home() {
		  return "this my hometown";
	  }
	  
	  @RequestMapping("/images")
	  public List<Image> getImages() {  
		  List<Image> images = service.getImages();
			         
		  return images;
	  }

	  @PostMapping("/images")
	  public Image save(@RequestBody() Image image) {
		  return service.save(image);
	  }
}
