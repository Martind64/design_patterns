package strategyPattern;

import strategyPattern.strategies.SplitByDashStrategy;
import strategyPattern.strategies.SplitByDotStrategy;

import java.util.List;

public class Main {

    public static void main(String [] args)
    {
        Document doc = new Document(new SplitByDotStrategy());
        doc.text = "hej.med.dig";

        List<String> res = doc.split();
        System.out.println(res.toString());

        Document doc2 = new Document(new SplitByDashStrategy());
        doc2.text = "hej.med-dig";

        List<String> res2 = doc2.split();
        System.out.println(res2.toString());
    }
}
