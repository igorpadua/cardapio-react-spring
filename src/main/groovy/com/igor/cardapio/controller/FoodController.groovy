package com.igor.cardapio.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/food")
class FoodController {

    @GetMapping
    void getAll() {

    }
}
