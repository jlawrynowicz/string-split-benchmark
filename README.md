# Running

mvn clean package && java -jar benchmark.jar

## Example results

```
jdk-13 shipilev nightly 64bit  linux
Benchmark                                                 Mode   Cnt     Score     Error   Units
MyBenchmark.splitWithColonOrSemicolonMethod               thrpt   30   927.598 ±  70.699  ops/ms
MyBenchmark.splitWithColonOrSemicolonPattern              thrpt   30  1065.258 ±  33.047  ops/ms
MyBenchmark.splitWithSemicolonCompiledPattern             thrpt   30  1981.966 ±  87.167  ops/ms
MyBenchmark.splitWithSemicolonCompiledPatternLiteral      thrpt   30  1667.357 ±  38.728  ops/ms
MyBenchmark.splitWithSemicolonMethod                      thrpt   30  3751.237 ± 161.307  ops/ms
MyBenchmark.splitWithSemicolonStringUtilsSplitWithChar    thrpt   30  3531.996 ±  97.181  ops/ms
MyBenchmark.splitWithSemicolonStringUtilsSplitWithString  thrpt   30  3583.589 ±  78.506  ops/ms

jdk-12 openjdk 64bit windows
Benchmark                                                  Mode  Cnt     Score     Error   Units
MyBenchmark.splitWithColonOrSemicolonMethod               thrpt   30  1326.864 ▒  30.625  ops/ms
MyBenchmark.splitWithColonOrSemicolonPattern              thrpt   30  1694.023 ▒  50.918  ops/ms
MyBenchmark.splitWithSemicolonCompiledPattern             thrpt   30  2317.796 ▒  44.575  ops/ms
MyBenchmark.splitWithSemicolonCompiledPatternLiteral      thrpt   30  1794.202 ▒  50.573  ops/ms
MyBenchmark.splitWithSemicolonMethod                      thrpt   30  6029.500 ▒ 301.620  ops/ms
MyBenchmark.splitWithSemicolonStringUtilsSplitWithChar    thrpt   30  5270.231 ▒  66.849  ops/ms
MyBenchmark.splitWithSemicolonStringUtilsSplitWithString  thrpt   30  5135.320 ▒  60.249  ops/ms

test runs without StringUtils test

jdk-12 zulu 64bit windows:
Benchmark                                              Mode  Cnt     Score    Error   Units
MyBenchmark.splitWithColonOrSemicolonMethod           thrpt   30  1284.243 ▒ 113.963  ops/ms
MyBenchmark.splitWithColonOrSemicolonPattern          thrpt   30  1650.300 ▒ 152.380  ops/ms
MyBenchmark.splitWithSemicolonCompiledPattern         thrpt   30  2305.984 ▒  27.687  ops/ms
MyBenchmark.splitWithSemicolonCompiledPatternLiteral  thrpt   30  1840.590 ▒  36.813  ops/ms
MyBenchmark.splitWithSemicolonMethod                  thrpt   30  6235.394 ▒  77.943  ops/ms

java-1.8.0-openjdk-1.8.0.212-3.b04.redhat.windows.x86 windows
Benchmark                                              Mode  Cnt     Score    Error   Units
MyBenchmark.splitWithColonOrSemicolonMethod           thrpt   30  1641.700 ▒  15.255  ops/ms
MyBenchmark.splitWithColonOrSemicolonPattern          thrpt   30  2058.478 ▒  43.767  ops/ms
MyBenchmark.splitWithSemicolonCompiledPattern         thrpt   30  3524.241 ▒  27.500  ops/ms
MyBenchmark.splitWithSemicolonCompiledPatternLiteral  thrpt   30  1698.169 ▒  74.297  ops/ms
MyBenchmark.splitWithSemicolonMethod                  thrpt   30  5564.004 ▒ 101.274  ops/ms

jdk12 zulu 32bit windows:
Benchmark                                              Mode  Cnt     Score    Error   Units
MyBenchmark.splitWithColonOrSemicolonMethod           thrpt   30   782.146 ▒  5.560  ops/ms
MyBenchmark.splitWithColonOrSemicolonPattern          thrpt   30  1061.627 ▒  9.718  ops/ms
MyBenchmark.splitWithSemicolonCompiledPattern         thrpt   30  1128.495 ▒ 21.567  ops/ms
MyBenchmark.splitWithSemicolonCompiledPatternLiteral  thrpt   30  1288.279 ▒ 16.943  ops/ms
MyBenchmark.splitWithSemicolonMethod                  thrpt   30  4204.879 ▒ 38.842  ops/ms

graalvm-ee-19.2.0 windows:
Benchmark                                              Mode  Cnt     Score     Error   Units
MyBenchmark.splitWithColonOrSemicolonMethod           thrpt   30  3317.681 ▒  45.884  ops/ms
MyBenchmark.splitWithColonOrSemicolonPattern          thrpt   30  3884.816 ▒ 139.502  ops/ms
MyBenchmark.splitWithSemicolonCompiledPattern         thrpt   30  5660.108 ▒ 138.670  ops/ms
MyBenchmark.splitWithSemicolonCompiledPatternLiteral  thrpt   30  2492.031 ▒  26.296  ops/ms
MyBenchmark.splitWithSemicolonMethod                  thrpt   30  8868.592 ▒ 149.699  ops/ms
```
