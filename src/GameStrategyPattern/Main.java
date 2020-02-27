package GameStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Context context=new Context(new FpsGame());
        System.out.println(context.executeStrategy("Counter Strike:GO "));
        Context context2=new Context(new Simulations());
        System.out.println(context2.executeStrategy("Flight simulator "));
        Context context3=new Context(new Adventure());
        System.out.println(context3.executeStrategy("Minecraft"));
    }
}
