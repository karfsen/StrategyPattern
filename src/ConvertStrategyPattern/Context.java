package ConvertStrategyPattern;

public class Context {
    private Strategy2 strategy;

    public Context(Strategy2 strategy) {
        this.strategy=strategy;
    }

    public String executeStrategy(int num){
        return strategy.convert(num);

    }
}
