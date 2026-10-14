package com.OnlineToyStore.controller;

import com.OnlineToyStore.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;

public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }














}
