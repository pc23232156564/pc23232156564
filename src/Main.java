public class Main {
    private String name;
    static private double x;
    static private double y;
    static private double S = 0;
    static private double step;

    static private double a;
    static private double b;


    public static void main(String[] args) {
        a = 0;
        b = 2;
        step = 0.0001;
        for (double x = a; a <= b; a = a + step) {
            y = f(x);
            S = S + step * y;
            System.out.println(y);
        }
        System.out.println("Площядь под графиком: " + S);
    }


    private static double f(double x) {
        return x * x + 2 * x;

    }
}

