import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static int arr[] = {2, 6, 4, -6, 5, -3, 7};


    public static void main(String[] args) throws IOException {

        System.out.println("Please, enter month number: ");
        System.out.println(MonthNumber.getDayAmountInMonth());
        System.out.println("");
        System.out.println("Sum of first 5  positive elemnets from array is:" + GetCount.getSumPositive());
        System.out.println("Product of all elemenrs from array is: " + GetCount.getProduct());
        System.out.println("");
        System.out.println(GetPosition.getPosition());
        System.out.println(OnlyPositive.getPositive());

        Car[] car = new Car[4];
        car[0] = new Car("Bus", 2000, 190);
        car[1] = new Car("Truck", 2004, 290);
        car[2] = new Car("Car", 2004, 140);
        car[3] = new Car("Bicycle", 2018, 2);

//Task 5
        System.out.println("Let`s see, what we have...");
        System.out.print("Model year = ");
        int modelYear = Integer.parseInt(br.readLine());
        Car.showCars(car, modelYear);


    }

}
