package com.example.se.jpamysqltuan4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.se.jpamysqltuan4.entity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Long>{

}
