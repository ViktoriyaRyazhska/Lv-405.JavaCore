package SoftServe.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new LinkedList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ){

            try {

                double a = Double.parseDouble(br.readLine());
                double b = Double.parseDouble(br.readLine());
                System.out.println(div(a, b));

            } catch (IOException | NumberFormatException e) {
                e.printStackTrace(System.err);
            }

            try {

                for (int i = 0; i < 10; i++) {
                    intList.add(readNumber(1, 100, br));
                }

                System.out.println(intList);

            } catch (IOException | IllegalArgumentException e) {
                e.printStackTrace(System.err);
            }

        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    // if arguments is double method will not throw ArithmeticException(division by zero) because double / 0.0 = infinity
    // and 0.0 / 0.0 = NaN
    private static double div(double a, double b){
        return a / b;
    }

    private static int readNumber(int start, int end, BufferedReader br) throws IOException,IllegalArgumentException {
        if(br == null){
            throw new IllegalArgumentException("BufferedReader cannot be null");
        }

            int number =  Integer.parseInt(br.readLine());
            if(number >= start && number <= end){
                return number;
            }else throw new IllegalArgumentException(String.format("Number should be in range [%d,%d]",start,end));

    }
}
