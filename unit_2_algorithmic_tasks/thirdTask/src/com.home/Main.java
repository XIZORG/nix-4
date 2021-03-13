package thirdTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        do {
            System.out.println("Enter number from 1 to 10:");
            x = scanner.nextDouble();
        } while (x < 1 || x > 10);
        double res = ((9 + x - 0.55) - (((int)(x) / 2) * 0.1) - (((int)x / 10) * 0.40));
        String buff = String.format("%.2f",res);
        String result = buff.replaceAll(",", ":");
        System.out.println("End time of the lesson:");
        System.out.println(result);
    }
}
