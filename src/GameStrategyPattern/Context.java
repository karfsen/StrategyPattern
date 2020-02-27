package GameStrategyPattern;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy=strategy;
    }

    public String executeStrategy(String game){
        return strategy.sayTypeOf(game);
    }
}
