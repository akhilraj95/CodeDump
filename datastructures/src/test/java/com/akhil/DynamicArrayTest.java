package com.akhil;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: akhil
 * Created on : 9/4/19
 */
public class DynamicArrayTest {

    private static final String CONSTANT_STRING_1 = "CONSTANT_STRING_1";
    private static final String CONSTANT_STRING_2 = "CONSTANT_STRING_2";
    private static final String CONSTANT_STRING_3 = "CONSTANT_STRING_3";

    @Test
    public void append() throws Exception {
        DynamicArray<String> array = new DynamicArray<>();
        array.append(CONSTANT_STRING_1);
        array.append(CONSTANT_STRING_2);
        array.append(CONSTANT_STRING_3);
        Assert.assertEquals(CONSTANT_STRING_1, array.get(0));

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void set() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

}
