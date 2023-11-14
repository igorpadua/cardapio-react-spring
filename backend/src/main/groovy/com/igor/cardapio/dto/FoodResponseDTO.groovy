package com.igor.cardapio.dto

import com.igor.cardapio.model.Food

record FoodResponseDTO(Long id, String title, String image, Integer price) {
    FoodResponseDTO(Food food) {
        this(food.id, food.title, food.image, food.price)
    }
}

