package GameStrategyPattern;

public class Adventure implements Strategy {
    @Override
    public String sayTypeOf(String game) {
        return game+" is a GameStrategyPattern.Adventure game";
    }
}
