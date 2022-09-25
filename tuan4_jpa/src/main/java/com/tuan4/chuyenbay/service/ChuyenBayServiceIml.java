package com.tuan4.chuyenbay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuan4.chuyenbay.model.ChuyenBay;
import com.tuan4.chuyenbay.repository.ChuyenBayRepository;

@Service
public class ChuyenBayServiceIml implements ChuyenBayService{

	@Autowired
	private ChuyenBayRepository repository;
	
	public List<ChuyenBay> chuyenBayDi(String gaDen) {
		// TODO Auto-generated method stub
		List<ChuyenBay> chuyenBays = repository.findGaDenChuyenBay(gaDen);
		return chuyenBays;
	}

	public List<ChuyenBay> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public List<ChuyenBay> findChuyenBayBetween8000and10000() {
		// TODO Auto-generated method stub
		return repository.findChuyenBayBetween8000and10000();
	}

	public List<ChuyenBay> findChuyenBaySGNtoBMV() {
		// TODO Auto-generated method stub
		return repository.findChuyenBaySGNtoBMV();
	}

	public List<ChuyenBay> findChuyenBayFromSGN() {
		// TODO Auto-generated method stub
		return repository.findChuyenBayFromSGN();
	}

	public List<ChuyenBay> findChuyenBayFrom(String noiDi) {
		// TODO Auto-generated method stub
		return repository.findChuyenBayFrom(noiDi);
	}

}
