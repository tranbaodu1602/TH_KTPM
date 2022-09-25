package com.tuan4.chuyenbay.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.Name;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {
	@Id
	@Column(name = "MaCB")
	private String maCB;
	
	@Column(name = "GaDi")
	private String gaDi;
	
	@Column(name = "GaDen")
	private String gaDen;
	
	@Column(name = "DoDai")
	private int doDai;
	
	@Column(name = "GioDi")
	private String gioDi;
	
	@Column(name = "GioDen")
	private String gioDen;
	
	@Column(name = "ChiPhi")
	private int chiPhi;
}

