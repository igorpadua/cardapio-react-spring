package com.igor.cardapio.controller

import com.igor.cardapio.dto.FoodRequestDTO
import com.igor.cardapio.dto.FoodResponseDTO
import com.igor.cardapio.model.Food
import com.igor.cardapio.service.FoodService
import groovy.transform.TypeChecked
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/food")
@TypeChecked
class FoodController {

    @Autowired
    FoodService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    void saveFood(@RequestBody FoodRequestDTO foodDTO) {
        Food food = new Food(foodDTO)
        service.saveFood(food)
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList = service.getAll().stream().map(FoodResponseDTO::new).toList()
        return foodList
    }
}
