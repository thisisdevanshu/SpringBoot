package com.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.domain.Car;
import com.dev.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository carRepository;
	
	public List<Car> getCar(){
		
	return 	carRepository.findAll();
	}
}
