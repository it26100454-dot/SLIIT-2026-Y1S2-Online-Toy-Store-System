package com.OnlineToyStore.service;

import com.OnlineToyStore.Model.Cart;
import com.OnlineToyStore.filehandling.CartFilehandler;

import java.math.BigDecimal;
import java.util.List;

public class CartService {
    private final CartFilehandler store;


    public CartService(CartFilehandler store) {

        this.store = store;
    }

    public List<Cart> getAllCarts(){
        return List.of();
    }
    public Cart getCartById(String cartId){
        return null;
    }
    public Cart saveCart(Cart cart){
        return cart;
    }
    public Cart updateCart(String cartId, Cart updated){
        return updated;
    }
    public void deleteCart(String cartId){}
    public BigDecimal calculateSubTotal(Cart cart){
        return null;
    }
    public BigDecimal calculateDiscount(BigDecimal subTotal, BigDecimal percentage){
        return subTotal;
    }













}
