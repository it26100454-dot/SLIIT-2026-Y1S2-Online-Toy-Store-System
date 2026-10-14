package com.OnlineToyStore.DTO;

import com.OnlineToyStore.Model.Cart;

public class CartResponse {
    private int status;
    private String message;
    private CartDTO cart;
    private CartDTO[] carts;
    private Long cartCount;
    public CartResponse() { }
    public CartResponse(int status, String message, CartDTO cart, CartDTO[] carts, Long cartCount) {
        this.status = status; this.message = message; this.cart = cart;
        this.carts = carts; this.cartCount = cartCount;
    }
    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public CartDTO getCart() { return cart; }
    public void setCart(CartDTO cart) { this.cart = cart; }
    public CartDTO[] getCarts() { return carts; }
    public void setCarts(CartDTO[] carts) { this.carts = carts; }
    public Long getCartCount() { return cartCount; }
    public void setCartCount(Long cartCount) { this.cartCount = cartCount; }

    public static CartResponse message(int status, String message) {
        return new CartResponse(status, message, null, null, null);
    }
}