package strategyPattern.strategies;

import strategyPattern.interfaces.SplittingStrategy;

import java.util.Arrays;
import java.util.List;

public class SplitByDotStrategy implements SplittingStrategy {

    public List<String> split(String str) {
        return Arrays.asList(str.split("\\."));
    }
}
