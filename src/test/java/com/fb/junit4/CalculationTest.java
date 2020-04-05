package com.fb.junit4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationTest {

    @Test
    public void add() {
        assertEquals(9,new Calculation().add(3,6));
    }

    @Test
    public void devide() {
        //System.out.println(new Calculation().devide(27,3));
        assertEquals(9, (int)new Calculation().devide(27F,3F));
    }
}