package com.hari.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hari.model.Car;

public interface CarRepository extends MongoRepository<Car,String>{

	
}
