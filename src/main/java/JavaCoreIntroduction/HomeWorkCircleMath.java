package JavaCoreIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkCircleMath {
    private final static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        double radius;
        double perimeter;
        double area;

        try {

            System.out.print("radius = " );
            radius = Double.parseDouble(consoleReader.readLine());

            perimeter = 2 * Math.PI * radius;
            area = Math.PI * Math.pow(radius,2);

            System.out.printf("perimeter = %.3f%n", perimeter);
            System.out.printf("area = %.3f%n",area);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
