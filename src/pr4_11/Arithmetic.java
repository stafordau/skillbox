package pr4_11;


public class Arithmetic {
    int a;
    int b;

    public Arithmetic(int c, int d) {
        this.a = c;
        this.b = d;
    }

    public int AdditionOperation() {
        return a + b;
    }

    int MultiplicationOperation() {
        return a * b;
    }

    public int MaximumNumber() {
        return a > b ? a : b;
    }

    public int MinimumNumber() {
        return a < b ? a : b;
    }
}

class Main{
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(5, 3);
        System.out.println(arithmetic.AdditionOperation());
        System.out.println(arithmetic.MultiplicationOperation());
        System.out.println(arithmetic.MaximumNumber());
        System.out.println(arithmetic.MinimumNumber());
    }
}