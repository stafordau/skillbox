package pr4_11;

public class Main2 {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 20, 100);
        basket.add("Chicken", 20, 3, 1200);
        basket.print("Milk");
        System.out.println(basket.getTotalWeight());
    }
}