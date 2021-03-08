package com.knoldus.test;

import com.knoldus.ReturnNextEven;
import org.junit.Assert;
import org.junit.Test;

public class ReturnNextEvenTest {
    @Test
    public void getReturnNewFunctionTest()
    {
        Long longReceived1 = ReturnNextEven.getNextEvenFunction.apply(5L);
        Assert.assertEquals(longReceived1,Long.valueOf(6));

        Long longReceived2 = ReturnNextEven.getNextEvenFunction.apply(8L);
        Assert.assertEquals(longReceived2,Long.valueOf(10));

        Long longReceived3 = ReturnNextEven.getNextEvenFunction.apply(10000003L);
        Assert.assertEquals(longReceived3,Long.valueOf(10000004));

        Long longReceived4 = ReturnNextEven.getNextEvenFunction.apply(9999L);
        Assert.assertEquals(longReceived4,Long.valueOf(10000));

        Long longReceived5 = ReturnNextEven.getNextEvenFunction.apply(2147483643L);
        Assert.assertEquals(longReceived5,Long.valueOf(2147483644));

        Long longReceived6 = ReturnNextEven.getNextEvenFunction.apply(-2147483644L);
        Assert.assertEquals(longReceived6,Long.valueOf(-2147483642));





    }

}
