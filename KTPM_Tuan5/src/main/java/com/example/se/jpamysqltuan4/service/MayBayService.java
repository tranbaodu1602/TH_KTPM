package com.example.se.jpamysqltuan4.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.se.jpamysqltuan4.entity.MayBay;

public interface MayBayService {
	public List<MayBay> findAll();
	public Optional<MayBay> findById(Long theId);
	public void save(MayBay mayBay);
	public void deleteById(Long maMB);
}
