package com.liu.zhibao.angrypandagradle.androidunit;

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
public class JsonParserTest {

    private JsonParser mJsonParser;
    @Before
    public void setUp() throws Exception {

        mJsonParser = new JsonParser();

    }

    @Test
    public void replaceSync() throws Exception {

        assertEquals("kcbfjds",mJsonParser.replaceSync("acbfjds"));

    }

}