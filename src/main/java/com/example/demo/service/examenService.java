package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.examen;
import com.example.demo.repository.Iexamen;

;

@Service
public class examenService implements IexamenService{
	@Autowired
	Iexamen iexamen;
	@Override
	public examen getExamen() {
		return  iexamen.getExamen();
	}

}
