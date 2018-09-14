package com.liu.zhibao.angrypandagradle.unit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by zhibao.Liu on 2018/9/13.
 *
 * @version :
 * @date : 2018/9/13
 * @des :
 * @see{@link}
 */
public class StrProcessorTest {

    private StrProcessor mStrProcessor;
    @Before
    public void setUp() throws Exception {
        mStrProcessor=new StrProcessor();
    }

    @Test
    public void replaceStr() throws Exception {
        assertEquals("zcbfjds",mStrProcessor.replaceStr("acbfjds"));
    }

}