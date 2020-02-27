package GameStrategyPattern;

public class Simulations implements Strategy {
    @Override
    public String sayTypeOf(String game) {
        return game+" is a Simulation game";
    }
}
