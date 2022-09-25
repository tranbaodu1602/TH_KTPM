package com.tuan4.chuyenbay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tuan4.chuyenbay.model.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	@Query("select c from ChuyenBay c where c.gaDen = ?1")
	List<ChuyenBay> findGaDenChuyenBay(String gaDen);
	
	@Query("select c from ChuyenBay c where c.doDai BETWEEN 8000 and 10000")
	List<ChuyenBay> findChuyenBayBetween8000and10000();
	
	@Query("select c from ChuyenBay c where c.gaDi = 'SGN' and c.gaDen = 'BMT'")
	List<ChuyenBay> findChuyenBaySGNtoBMV();
	
	@Query("select c from ChuyenBay c where c.gaDi = 'SGN'")
	List<ChuyenBay> findChuyenBayFromSGN();
	
	@Query("select c from ChuyenBay c where c.gaDi = ?1")
	List<ChuyenBay> findChuyenBayFrom(String noiDi);
}
