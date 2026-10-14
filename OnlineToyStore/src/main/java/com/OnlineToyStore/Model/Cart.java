package com.OnlineToyStore.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String CartID;
    private String UserID;
    private LocalDateTime Date;
    private int totalCartItems;
    private int totalQuantity;
    private BigDecimal subTotal = BigDecimal.ZERO;
    private List<CartItem> CartItemList = new ArrayList<>();

    public Cart() {}

    public Cart(String userID, String cartID, LocalDateTime date) {
        UserID = userID;
        CartID = cartID;
        Date = date;
    }

    public String getCartID() {
        return CartID;
    }

    public void setCartID(String cartID) {
        CartID = cartID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public LocalDateTime getDate() {
        return Date;
    }

    public void setDate(LocalDateTime date) {
        Date = date;
    }

    public int getTotalCartItems() {
        return totalCartItems;
    }

    public void setTotalCartItems(int totalCartItems) {
        this.totalCartItems = totalCartItems;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public List<CartItem> getCartItemList() {
        return CartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        CartItemList = cartItemList;
    }



    public String toFileString() {
        return getCartID() + "|" + getUserID() + "|" + Date;   // LocalDateTime.toString() -> 2026-10-12T10:30

    }

    public static Cart fromFileString(String line) {
        String[] p = line.split("\\|", -1);
        return new Cart(p[0], p[1], LocalDateTime.parse(p[2]));
    }
}




