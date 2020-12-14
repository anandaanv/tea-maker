package com.crio.teamaker;

import java.util.ArrayList;
import java.util.List;

public class Pot {

    private int capacity;
    private int contentSize;

    private List<Ingredient> content = new ArrayList<>();

    public List<Ingredient> getContent() {
        return content;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getContentSize() {
        return contentSize;
    }

    public void setContentSize(int contentSize) {
        this.contentSize = contentSize;
    }

    public boolean isEmpty() {
        if (contentSize < 0) {
            throw new RuntimeException("Content size cannot be less than 0");
        }
        return contentSize == 0;
    }

    public void addContent(Ingredient ingredient) {
        if(contentSize + ingredient.getAmount() > capacity){
            throw new RuntimeException("Content size exceeds capacity");
        }
        content.add(ingredient);
        contentSize += ingredient.getAmount();
    }

}
