package GameStrategyPattern;

public class FpsGame implements Strategy {
    @Override
    public String sayTypeOf(String game) {
        return game+" is a FPS game";
    }
}
