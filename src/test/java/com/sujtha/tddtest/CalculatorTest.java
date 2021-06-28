package com.sujtha.tddtest;

import org.junit.Assert;
import org.junit.Test;
import tddmain.Calculator;

public class CalculatorTest {
    @Test
    public void addition() {
        Calculator calculator = new Calculator ();
        int actual =calculator.add(3,3);
        int expected =6;
        Assert.assertEquals ( expected,actual );


    }










}
