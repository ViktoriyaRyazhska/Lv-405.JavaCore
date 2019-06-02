import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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



    }

}
