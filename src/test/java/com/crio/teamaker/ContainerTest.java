package com.crio.teamaker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @Test
    void isEmpty() {
        Container pot = new Container();
        assertTrue(pot.isEmpty());
    }

    @Test
    void isNotEmpty() {
        Container pot = new Container();
        pot.setAvailableAmount(1);
        assertEquals(pot.getAvailableAmount(), 1);
        assertFalse(pot.isEmpty());
    }

    @Test
    void throwsRuntimeExceptionWhenContentsNegative() {
        Container pot = new Container();
        pot.setAvailableAmount(-1);
        assertThrows(RuntimeException.class, () -> pot.isEmpty());
    }


    @Test
    void dispense() {
        Container pot = new Container();
        pot.setAvailableAmount(5);
        pot.setContent(Content.WATER);
        Ingredient dispense = pot.dispense(2);
        assertEquals(new Ingredient(Content.WATER, 2), dispense);
    }

    @Test
    void dispenseBeyondCapacity() {
        Container pot = new Container();
        pot.setContent(Content.WATER);
        pot.setAvailableAmount(1);
        assertThrows(RuntimeException.class, () -> pot.dispense(2));
    }
}