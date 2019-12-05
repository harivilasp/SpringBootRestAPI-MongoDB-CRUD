package com.hari.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hari.model.Car;
import com.hari.repository.CarRepository;

@RestController
public class CarController {
	@Autowired
	private CarRepository repository;
	
	@PostMapping("/addCar")
	private String saveCar(@RequestBody Car car)
	{
		repository.save(car);
		return "Added Car with Model No: "+ car.getModelNo();
	}
	
	@GetMapping("/findAllCars/{id}")
	public Optional<Car> getCar(@PathVariable String id)
	{
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCar(@PathVariable String id)
	{
		repository.deleteById(id);
		return "Car Deleted with Model No : "+ id;
	}

}
