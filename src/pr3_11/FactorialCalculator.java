package pr3_11;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        int res = 1;
        for (int i = 1; i <= value; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}
