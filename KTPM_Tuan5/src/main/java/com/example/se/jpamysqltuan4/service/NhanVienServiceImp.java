package com.example.se.jpamysqltuan4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.se.jpamysqltuan4.dao.NhanVienRepository;
import com.example.se.jpamysqltuan4.entity.ChuyenBay;
import com.example.se.jpamysqltuan4.entity.NhanVien;

@Service
public class NhanVienServiceImp implements NhanVienService{
	@Autowired
	private NhanVienRepository nhanVienRep;
	@Override
	public List<NhanVien> findAll() {
		// TODO Auto-generated method stub
		return nhanVienRep.findAll();
	}

	@Override
	public Optional<NhanVien> findById(String theId) {
		// TODO Auto-generated method stub
		return nhanVienRep.findById(theId);
	}

	@Override
	public void save(NhanVien nhanVien) {
		nhanVienRep.save(nhanVien);
	}

	@Override
	public void deleteById(String maNV) {
		nhanVienRep.deleteById(maNV);
	}

}
