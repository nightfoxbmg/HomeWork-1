package HW1;

public class SelectColor {
    public static void selectColor() {
        int data = 30;
        if (data <= 10) {
            System.out.println("Red");
        } else if (data <= 20) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void main(String[] args) {
        selectColor();
    }
}
