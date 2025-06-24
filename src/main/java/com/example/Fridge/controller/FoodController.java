package com.example.Fridge.controller;

import com.example.Fridge.model.Food;
import com.example.Fridge.repository.FoodRepository;
import com.example.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    // injeção de dependência
    private final FoodService foodService;
    private final FoodRepository foodRepository;

    public FoodController(FoodService foodService, FoodRepository foodRepository) {
        this.foodService = foodService;
        this.foodRepository = foodRepository;
    }

    // Listar
    @GetMapping
    public List<Food> getAll() { return foodService.getAll(); }

    @PostMapping
    public Food create(String name, LocalDate expirationDate, Integer quantity) {
        return
    }
}
