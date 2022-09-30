package com.example.se.jpamysqltuan4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.se.jpamysqltuan4.entity.ChuyenBay;
import com.example.se.jpamysqltuan4.entity.MayBay;
import com.example.se.jpamysqltuan4.service.ChuyenBayService;
import com.example.se.jpamysqltuan4.service.MayBayService;

@RestController
@RequestMapping("/api")
public class chuyenbaycontroller {
	@Autowired
	private ChuyenBayService chuyenBayService;
	@Autowired
	private MayBayService mayBayService;

	@GetMapping("/chuyenbay")
	public List<ChuyenBay> findAlls() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findAll();
		System.out.println(chuyenBays);
		return chuyenBayService.findAll();
	}

	@GetMapping("/find")
	public List<MayBay> findAll() {
		return mayBayService.findAll();
	}
}
