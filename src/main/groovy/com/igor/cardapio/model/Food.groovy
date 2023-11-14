package com.igor.cardapio.model


import com.igor.cardapio.dto.FoodRequestDTO
import groovy.transform.Canonical
import groovy.transform.TypeChecked
import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.EqualsAndHashCode
import lombok.NoArgsConstructor

@Table
@Entity
@TypeChecked
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String image;
    Integer price;

    Food(FoodRequestDTO foodDTO) {
        this.title = foodDTO.title;
        this.image = foodDTO.image;
        this.price = foodDTO.price;
    }

    Food() {

    }
}
