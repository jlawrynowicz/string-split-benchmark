package com.github.jlawrynowicz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataProviderTest {

    @Test
    public void setup() {
        DataProvider dataProvider = new DataProvider();
        dataProvider.setup();

        assertEquals("1000000000;a column with some longer data;1000000000th", dataProvider.getInput());
    }
}