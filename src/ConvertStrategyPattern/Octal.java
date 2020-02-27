package ConvertStrategyPattern;

public class Octal implements Strategy2 {
    @Override
    public String convert(Integer number) {
        return Integer.toString(number,8) ;
    }
}
