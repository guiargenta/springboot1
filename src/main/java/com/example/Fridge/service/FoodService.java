package com.example.Fridge.service;

import com.example.Fridge.model.Food;
import com.example.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    public Food save(Food food) {
        return foodRepository.save(food);
    }

    public void delete(Long id) {
        foodRepository.deleteById(id);
    }
}
