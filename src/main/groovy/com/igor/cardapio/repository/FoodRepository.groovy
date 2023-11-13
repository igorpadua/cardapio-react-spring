package com.igor.cardapio.repository

import com.igor.cardapio.model.Food
import org.springframework.data.jpa.repository.JpaRepository

interface FoodRepository extends JpaRepository<Food, Long> {
}
