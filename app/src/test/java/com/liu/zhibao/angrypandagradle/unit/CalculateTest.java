package com.liu.zhibao.angrypandagradle.unit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhibao.Liu on 2018/9/13.
 *
 * @version :
 * @date : 2018/9/13
 * @des :
 * @see{@link}
 */
public class CalculateTest {

    private Calculate mCalculate;
    @Before
    public void setUp() throws Exception {
        mCalculate = new Calculate();
    }

    @Test
    public void add() throws Exception {
        assertEquals(7,mCalculate.Add(2,5),0);
    }

}