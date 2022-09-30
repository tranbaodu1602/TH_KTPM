package com.example.se.jpamysqltuan4.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "chungnhan")
@Data
@IdClass(ChungNhanPK.class)
public class ChungNhan {

	@Id
	@ManyToOne(optional=false)
	@JoinColumn(name="maMB",referencedColumnName="MaMB")
	private MayBay maMB;

	@Id
	@ManyToOne(optional=false)
	@JoinColumn(name="maMB",referencedColumnName="MaNV")
	private NhanVien maNV;

}