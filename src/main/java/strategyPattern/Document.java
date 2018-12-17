package strategyPattern;

import strategyPattern.interfaces.SplittingStrategy;

import java.util.List;

public class Document {

    private SplittingStrategy strategy;

    public String text;

    public Document(SplittingStrategy strategy) {
        this.strategy = strategy;
    }

    public List<String> split(){
        return this.strategy.split(this.text);
    }

}
