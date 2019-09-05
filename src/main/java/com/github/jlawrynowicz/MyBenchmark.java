package com.github.jlawrynowicz;

import org.apache.commons.lang3.StringUtils;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 10, time = 1)
@Measurement(iterations = 30, time = 1)
@BenchmarkMode(Mode.Throughput)
@Threads(1)
@Fork(1)
public class MyBenchmark {

    private static final Pattern SEMICOLON_PATTERN = Pattern.compile(";");
    private static final Pattern SEMICOLON_PATTERN_LITERAL = Pattern.compile(";", Pattern.LITERAL);

    private static final String COLON_OR_SEMICOLON_REGEX = "[;:]";
    private static final Pattern COLON_OR_SEMICOLON_PATTERN = Pattern.compile(COLON_OR_SEMICOLON_REGEX);

    @Benchmark
    public String[] splitWithSemicolonMethod(DataProvider dataProvider) {
        return dataProvider.getInput().split(";");
    }

    @Benchmark
    public String[] splitWithSemicolonCompiledPattern(DataProvider dataProvider) {
        return SEMICOLON_PATTERN.split(dataProvider.getInput());
    }

    @Benchmark
    public String[] splitWithSemicolonCompiledPatternLiteral(DataProvider dataProvider) {
        return SEMICOLON_PATTERN_LITERAL.split(dataProvider.getInput());
    }

    @Benchmark
    public String[] splitWithSemicolonStringUtilsSplitWithChar(DataProvider dataProvider) {
        return StringUtils.split(dataProvider.getInput(), ';');
    }

    @Benchmark
    public String[] splitWithSemicolonStringUtilsSplitWithString(DataProvider dataProvider) {
        return StringUtils.split(dataProvider.getInput(), ";");
    }

    @Benchmark
    public String[] splitWithColonOrSemicolonPattern(DataProvider dataProvider) {
        return COLON_OR_SEMICOLON_PATTERN.split(dataProvider.getInput());
    }

    @Benchmark
    public String[] splitWithColonOrSemicolonMethod(DataProvider dataProvider) {
        return dataProvider.getInput().split(COLON_OR_SEMICOLON_REGEX);
    }
}
