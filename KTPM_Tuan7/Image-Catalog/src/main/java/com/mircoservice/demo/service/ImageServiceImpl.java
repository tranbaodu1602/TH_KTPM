package com.mircoservice.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mircoservice.demo.model.Image;
import com.mircoservice.demo.repository.ImageRepository;


@Service
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	private ImageRepository repository;

	@Override
	public Image save(Image image) {
		// TODO Auto-generated method stub
		return repository.save(image);
	}

	@Override
	public List<Image> getImages() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
