package ConvertStrategyPattern;

public class Hexdecimal implements Strategy2 {
    @Override
    public String convert(Integer number) {
        return Integer.toString(number,16);
    }
}
