package com.example.se.jpamysqltuan4.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class ChungNhanPK implements Serializable {
	@Column(name = "MaNV", nullable = false)
	private String maNV;
	@Column(name = "MaMB", nullable = false)
	private Long maMB;
	@Override
	public String toString() {
		return "ChungNhanPK [maNV=" + maNV + ", maMB=" + maMB + "]";
	}
	public ChungNhanPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChungNhanPK(String maNV, Long maMB) {
		super();
		this.maNV = maNV;
		this.maMB = maMB;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public Long getMaMB() {
		return maMB;
	}
	public void setMaMB(Long maMB) {
		this.maMB = maMB;
	}
	
}