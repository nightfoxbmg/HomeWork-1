package HW1;

public class addOrSubtractAndPrint {
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;

        if (increment) {
            result = initValue + delta;
            System.out.println("Результат: " + result);
        } else {
            result = initValue - delta;
            System.out.println("Результат: " + result);
        }
    }

    public static void main(String[] args) {
        addOrSubtractAndPrint(10, 5, true);
        addOrSubtractAndPrint(10, 5, false);
    }

}
