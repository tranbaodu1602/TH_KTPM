package com.mircoservice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mircoservice.demo.gallery.GalleryImage;

@RestController  
@RequestMapping("/")  
public class HomeController {
	@Autowired
	private RestTemplate restTemplate;  
	
	@Autowired  
	private Environment env;  
	
	 @RequestMapping("/")  
	   public String home() {  
	     return "home";
	   }
	   
	   
	@RequestMapping("/{id}")
	public GalleryImage getGalleryImage(@PathVariable Long id) {
		GalleryImage gallery = new GalleryImage();
		//gallery.setId(id) ;
		List<Object> images = restTemplate.getForObject("http://image-service/images/", List.class);
		//gallery.setImages(images);  
	    return gallery;
	}
	
	public String homeAdmin() {  
	      return "This is the admin area of Gallery service running at port: " + env.getProperty("local.server.port");  
	   }  
}
