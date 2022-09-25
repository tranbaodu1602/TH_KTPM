package com.tuan4.chuyenbay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuan4.chuyenbay.model.ChuyenBay;
import com.tuan4.chuyenbay.service.ChuyenBayService;

@RestController
@RequestMapping("api/v1/chuyenbay")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayService service;
	
	@GetMapping("")
	public List<ChuyenBay> getChuyeBay(){
		
		return service.findAll();
	}
	
	@GetMapping("/{gaDen}")
	public List<ChuyenBay> getChuyeBayDen(@PathVariable("gaDen") String gaDen){
		
		return service.chuyenBayDi(gaDen);
	}
	
	@GetMapping("/Between8000and10000")
	public List<ChuyenBay> findChuyenBayBetween8000and10000(){
		return service.findChuyenBayBetween8000and10000();
	}
	
	@GetMapping("/SGNtoBMT")
	public List<ChuyenBay> findChuyenBaySGNtoBMV(){
		return service.findChuyenBaySGNtoBMV();
	}
	
	@GetMapping("/FromSGN")
	List<ChuyenBay> findChuyenBayFromSGN(){
		return service.findChuyenBayFromSGN();
	}
	
	@GetMapping("/{noiDi}")
	List<ChuyenBay> findChuyenBayFrom(@PathVariable("noiDi") String noiDi){
		return service.findChuyenBayFrom(noiDi);
	}
	
}
