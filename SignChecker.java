package HW1;

public class SignChecker{
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {
        checkSign(3, -8, 5); // пример вызова метода с аргументами 3, -8 и 5
    }
}
