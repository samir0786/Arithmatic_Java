package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class Arithmetictest {
    @Test
    public void given_TwoInput_WhenAdd_ReturnAddition() {
        Arithmetic arithmetic = new Arithmetic();
        int add = arithmetic.add(3, 4);
        Assert.assertEquals(7,add);
    }

    @Test
    public void given_TwoInput_WhenSubtract_ReturnSubtraction() {
        Arithmetic arithmetic = new Arithmetic();
        int subtract=arithmetic.subtract(7, 4);
        Assert.assertEquals(3,subtract);
    }

    @Test
    public void given_TwoInput_WhenDivision_ReturnDivision() {
        Arithmetic arithmetic = new Arithmetic();
        int division=arithmetic.division(20, 4);
        Assert.assertEquals(5,division);

    }

    @Test
    public void given_TwoInput_WhenMultiply_ReturnMultiplication() {
        Arithmetic arithmetic = new Arithmetic();
        int Multiplication=arithmetic.Multiplication(20, 4);
        Assert.assertEquals(80,Multiplication);
    }
}
