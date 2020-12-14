package com.crio.teamaker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PotTest {

    @Test
    void isEmpty() {
        Pot pot = new Pot();
        assertTrue(pot.isEmpty());
    }

    @Test
    void isNotEmpty() {
        Pot pot = new Pot();
        pot.setContentSize(1);
        assertEquals(pot.getContentSize(), 1);
        assertFalse(pot.isEmpty());
    }

    @Test
    void throwsRuntimeExceptionWhenContentsNegative() {
        Pot pot = new Pot();
        pot.setContentSize(-1);
        assertThrows(RuntimeException.class, () -> pot.isEmpty());
    }

    @Test
    void addWater3cups() {
        Pot pot = new Pot();
        pot.setCapacity(10);
        pot.addContent(new Ingredient(Content.WATER, 3));
        assertTrue(pot.getContent().contains(new Ingredient(Content.WATER, 3)));
        assertEquals(pot.getContentSize(), 3);
    }

    @Test
    void verifyPotOverflowsWhenContentsMoreThanCapacity() {
        Pot pot = new Pot();
        pot.setCapacity(2);
        assertThrows(RuntimeException.class, () -> pot.addContent(new Ingredient(Content.WATER, 3)));
    }

}