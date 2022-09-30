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
@Table(name = "maybay")
@Data
public class MayBay {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaMB", nullable = false)
	private Long maMB;

	@Column(name = "Loai")
	private String loai;

	@Column(name = "TamBay")
	private Long tamBay;

	@Override
	public String toString() {
		return "MayBay [maMB=" + maMB + ", loai=" + loai + ", tamBay=" + tamBay + "]";
	}

	public MayBay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MayBay(Long maMB, String loai, Long tamBay) {
		super();
		this.maMB = maMB;
		this.loai = loai;
		this.tamBay = tamBay;
	}

	public Long getMaMB() {
		return maMB;
	}

	public void setMaMB(Long maMB) {
		this.maMB = maMB;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public Long getTamBay() {
		return tamBay;
	}

	public void setTamBay(Long tamBay) {
		this.tamBay = tamBay;
	}
	

}