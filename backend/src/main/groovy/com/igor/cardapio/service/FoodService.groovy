package com.igor.cardapio.service

import com.igor.cardapio.model.Food
import com.igor.cardapio.repository.FoodRepository
import groovy.transform.TypeChecked
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@TypeChecked
class FoodService {
    @Autowired
    FoodRepository repository;

    List getAll() {
        return repository.findAll();
    }

    void saveFood(Food food) {
        repository.save(food);
    }
}
