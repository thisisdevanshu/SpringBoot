package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
