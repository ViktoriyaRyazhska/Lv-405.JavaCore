package JavaCoreIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkPhoneCalls {
    private final static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

        double pricePerMin1;
        double pricePerMin2;
        double pricePerMin3;

        int firstTalkDuration;
        int secondTalkDuration;
        int thirdTalkDuration;

        double firstTalkCost;
        double secondTalkCost;
        double thirdTalkCost;

        double sumOfCosts;

        try {

            System.out.println("Please enter the price per minute for the first country:");
            pricePerMin1 = Double.parseDouble(consoleReader.readLine());
            System.out.println("Please enter the price per minute for the second country:");
            pricePerMin2 = Double.parseDouble(consoleReader.readLine());
            System.out.println("Please enter the price per minute for the third country:");
            pricePerMin3 = Double.parseDouble(consoleReader.readLine());

            System.out.println("Please enter first talk duration(minute): ");
            firstTalkDuration = Integer.parseInt(consoleReader.readLine());
            System.out.println("Please enter second talk duration(minute): ");
            secondTalkDuration = Integer.parseInt(consoleReader.readLine());
            System.out.println("Please enter third talk duration(minute): ");
            thirdTalkDuration = Integer.parseInt(consoleReader.readLine());

            firstTalkCost = pricePerMin1 * firstTalkDuration;
            secondTalkCost = pricePerMin2 * secondTalkDuration;
            thirdTalkCost = pricePerMin3 * thirdTalkDuration;
            sumOfCosts = firstTalkCost + secondTalkCost + thirdTalkCost;

            System.out.printf("The first talk cost - %.2f$%n", firstTalkCost);
            System.out.printf("The second talk cost - %.2f$%n", secondTalkCost);
            System.out.printf("The third talk cost - %.2f$%n", thirdTalkCost);
            System.out.printf("The total cost - %.2f$%n", sumOfCosts);

        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}
