package com.crio.teamaker;

public class Container {

    private int capacity;
    private Content content;
    private int availableAmount;



    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }


    public boolean isEmpty() {
        if (availableAmount < 0) {
            throw new RuntimeException("Content size cannot be less than 0");
        }
        return availableAmount == 0;
    }

    public Ingredient dispense(int amount) {
        if (availableAmount < amount) {
            throw new RuntimeException("cannot dispense");
        }
        return new Ingredient(content, amount);
    }
}
