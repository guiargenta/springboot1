package com.example.Fridge.repository;

import com.example.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> id(Long id);

}
