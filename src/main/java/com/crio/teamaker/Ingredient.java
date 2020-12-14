package com.crio.teamaker;

import java.util.Objects;

public class Ingredient {
    private Content content;
    private int amount;


    public Ingredient(Content content, int amount) {
        this.content = content;
        this.amount = amount;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return amount == that.amount &&
                content == that.content;
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, amount);
    }
}
