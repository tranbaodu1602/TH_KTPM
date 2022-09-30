package com.example.se.jpamysqltuan4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "nhanvien")
@Data
public class NhanVien {
	@Id
	@Column(name = "MaNV", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String manv;

	@Column(name = "Ten")
	private String ten;

	@Column(name = "Luong")
	private Long luong;

	public NhanVien(String manv, String ten, Long luong) {
		super();
		this.manv = manv;
		this.ten = ten;
		this.luong = luong;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Long getLuong() {
		return luong;
	}

	public void setLuong(Long luong) {
		this.luong = luong;
	}

	@Override
	public String toString() {
		return "NhanVien [manv=" + manv + ", ten=" + ten + ", luong=" + luong + "]";
	}

}