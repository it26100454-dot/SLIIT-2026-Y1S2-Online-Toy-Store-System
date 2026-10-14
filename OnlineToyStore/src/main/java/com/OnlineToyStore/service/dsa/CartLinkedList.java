package com.OnlineToyStore.service.dsa;

public class CartLinkedList {
    private CartNode head, tail;
    private int size;


    public void add(CartItem item){
        CartNode n = new CartNode(item);
        if (head == null){
            head = tail = n;
        }
        else {
            tail.next = n;
            tail = n;
            size++;
        }

    }

    public CartLinkedList() {
    }
}
