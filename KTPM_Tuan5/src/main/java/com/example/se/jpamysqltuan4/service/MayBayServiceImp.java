package com.example.se.jpamysqltuan4.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.se.jpamysqltuan4.dao.MayBayRepository;
import com.example.se.jpamysqltuan4.entity.MayBay;

@Service
public class MayBayServiceImp implements MayBayService{
	@Autowired
	private MayBayRepository mayBayRepository;
	@Override
	public List<MayBay> findAll() {
		// TODO Auto-generated method stub
		return mayBayRepository.findAll();
	}

	@Override
	public Optional<MayBay> findById(Long theId) {
		// TODO Auto-generated method stub
		return mayBayRepository.findById(theId);
	}

	@Override
	public void save(MayBay mayBay) {
		// TODO Auto-generated method stub
		mayBayRepository.save(mayBay);
	}

	@Override
	public void deleteById(Long maMB) {
		mayBayRepository.deleteById(maMB);
	}

}
