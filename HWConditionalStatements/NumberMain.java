package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberMain {

    private static double a, b, c;
    private static int a2, b2, c2;

    public static void main(String[] args) throws IOException {

        System.out.println("Please, enter 3 float numbers to check if they are belong to the range [-5;5]");
        doubleInitialization();
        System.out.println("Numbers are belong to the range " + belongToTheRange(a, b, c));
        System.out.println();
        System.out.println("Please, enter 3 int numbers to check the max and min");
        intInitialization();
        System.out.println("Max: " + getMax(a2, b2, c2));
        System.out.println("Min: " + getMin(a2, b2, c2));

    }


    private static void doubleInitialization() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("a = ");
        a = Double.parseDouble(br.readLine());
        System.out.print("b = ");
        b = Double.parseDouble(br.readLine());
        System.out.print("c = ");
        c = Double.parseDouble(br.readLine());
    }

    private static void intInitialization() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("a = ");
        a2 = Integer.parseInt(br.readLine());
        System.out.print("b = ");
        b2 = Integer.parseInt(br.readLine());
        System.out.print("c = ");
        c2 = Integer.parseInt(br.readLine());
    }

    private static boolean belongToTheRange(double a, double b, double c) {
        return (a >= -5 && a <= 5) && (b >= -5 && b <= 5) && (c >= -5 && c <= 5);
    }

    public static int getMax(int a, int b, int c) {
        return (a >= b && a >= c) ? a : (b >= c) ? b : c;
    }

    public static int getMin(int a, int b, int c) {
        return (a <= b && a <= c) ? a : (b <= c) ? b : c;
    }


}
