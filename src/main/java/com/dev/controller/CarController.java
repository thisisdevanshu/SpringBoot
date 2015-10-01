package com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.domain.Car;
import com.dev.service.CarService;

@RestController
public class CarController {

	@Autowired
	CarService carService;
	
	@RequestMapping(value = "/car/list" , method = RequestMethod.GET)
	public List<Car> getCar(){
		
		
		
		return carService.getCar();
	}
}
