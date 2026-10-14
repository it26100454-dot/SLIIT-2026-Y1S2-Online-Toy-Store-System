package com.OnlineToyStore.service.dsa;

public class CartNode {
    CartItem data;
    CartNode next;

    public CartNode(CartItem data) {
        this.data = data;
    }
}
