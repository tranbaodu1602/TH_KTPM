package com.mircoservice.demo.service;

import java.util.List;

import com.mircoservice.demo.model.Image;

public interface ImageService {
	Image save(Image image);
	List<Image> getImages();
}
