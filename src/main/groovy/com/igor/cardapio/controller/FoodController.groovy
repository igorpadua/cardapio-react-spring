package com.igor.cardapio.controller

import com.igor.cardapio.model.Food
import com.igor.cardapio.service.FoodService
import groovy.transform.TypeChecked
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/food")
@TypeChecked
class FoodController {

    @Autowired
    FoodService service;

    @GetMapping
    List<FoodDTO> getAll() {
        List<Food> foodList = service.getAll()
        return foodList
    }
}
