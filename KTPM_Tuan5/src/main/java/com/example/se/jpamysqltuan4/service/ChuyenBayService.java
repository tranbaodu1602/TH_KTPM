package com.example.se.jpamysqltuan4.service;
import java.util.ArrayList;
import java.util.List;

import com.example.se.jpamysqltuan4.entity.ChuyenBay;


public interface ChuyenBayService {
	public ArrayList<ChuyenBay> FindAll();
	public ChuyenBay findById(int theId);
	public void save(ChuyenBay chuyenBay);
	public void deleteById(String maCB);
}
