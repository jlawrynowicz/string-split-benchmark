package com.github.jlawrynowicz;

import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class DataProvider {

    private String input;
    private long i = 1000000000;

    @Setup(Level.Invocation)
    public void setup() {

        long number = i++;
        this.input = String.format("%d;a column with some longer data;%dth", number, number);
    }

    public String getInput() {
        return input;
    }
}
