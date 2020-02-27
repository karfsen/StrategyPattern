package ConvertStrategyPattern;

public class Binary implements Strategy2 {


    @Override
    public String convert(Integer number) {
        return Integer.toString(number,2) ;
    }
}
