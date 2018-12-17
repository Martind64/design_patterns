package strategyPattern.interfaces;

import java.util.List;

public interface SplittingStrategy {
    List<String> split(String str);
}
