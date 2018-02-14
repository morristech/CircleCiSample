package fudi.freddy.circlecisample.math;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 1.0
 * @autor Romell Domínguez
 * @date 2/10/18
 */
public class SumTest {
    @Test
    public void method() throws Exception {
        assertEquals(Sum.method(2,3),5);
    }


    @Test
    public void methodErrorSolved() throws Exception {
        assertEquals(Sum.method(999,999),999+999);
    }


    @Test
    public void methodThrid() throws Exception {
        assertEquals(Sum.method(-999,999),0);
    }


    @Test
    public void methodFour() throws Exception {
        assertEquals(Sum.method(-0,0),0);
    }

}