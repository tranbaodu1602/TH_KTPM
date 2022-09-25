package com.tuan4.chuyenbay.service;

import java.util.List;

import com.tuan4.chuyenbay.model.ChuyenBay;

public interface ChuyenBayService {
	List<ChuyenBay> chuyenBayDi(String gaDen);
	List<ChuyenBay> findAll();
	List<ChuyenBay> findChuyenBayBetween8000and10000();
	List<ChuyenBay> findChuyenBaySGNtoBMV();
	List<ChuyenBay> findChuyenBayFromSGN();
	
	List<ChuyenBay> findChuyenBayFrom(String noiDi);
 }
