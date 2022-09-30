package com.example.se.jpamysqltuan4.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.se.jpamysqltuan4.entity.ChuyenBay;
import com.example.se.jpamysqltuan4.entity.NhanVien;

public interface NhanVienService {
	public List<NhanVien> findAll();
	public Optional<NhanVien> findById(String theId);
	public void save(NhanVien nhanVien);
	public void deleteById(String maNV);
}
