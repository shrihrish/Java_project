package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortnumberTest {
    Sortnumber sort;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void dsort()  throws Exception {
        String expectedValue ="false";
        int a[] = {2,3,4,5,3,4};

    String actualValue = sort.dsort(a,6);
    assertEquals(expectedValue,actualValue);
    assertNotNull(actualValue);

    }
}