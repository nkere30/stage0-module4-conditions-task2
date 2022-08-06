package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public static void printGreatest(int first, int second) {
        if(first >= second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }

    public static void main(String[] args) {
        printGreatest(15, 3);
        printGreatest(3, 8);
        printGreatest(7, 7);
    }
}
