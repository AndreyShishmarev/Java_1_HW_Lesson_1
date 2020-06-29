

public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(10, 3, 4, 5));
        System.out.println(task10and20(5, 5));
        isPositiveOrNegative(1);
        System.out.println(isNegative(-3));
        greetings("Андрей");
    }

    //ДЗ 1.3
    public static float calculate(float a, float b, float c, float d) {
        float sum = a * (b + (c / d));
        return sum;
    }

    //ДЗ 1.4
    public static boolean task10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //ДЗ 1.5
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное число!");
        } else {
            System.out.println("Отрицательное число!");
        }

    }
    //ДЗ 1.6
    public static boolean isNegative(int x){
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }
    //ДЗ 1.7
    public static void greetings(String name){
        System.out.println("Привет "+name);
    }
}