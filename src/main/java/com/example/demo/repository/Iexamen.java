package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.examen;



@Repository
public interface Iexamen extends JpaRepository<examen,Integer>{
	@Query(value="{call  sp_getResumen}",nativeQuery = true)
	examen getExamen();
}
