package com.mircoservice.demo.gallery;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GalleryImage {
	private Long id;  
    private List<Object> images;  

}
