package ConvertStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Context c1=new Context(new Binary());
        Context c2=new Context(new Octal());
        Context c3=new Context(new Hexdecimal());

        System.out.println(c1.executeStrategy(16));
        System.out.println(c2.executeStrategy(8));
        System.out.println(c3.executeStrategy(385));

    }
}
