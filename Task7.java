import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int getFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) throws  IOException{
        System.out.println("Please enter value ");
        int n = Integer.parseInt(br.readLine());
        System.out.println(getFactorial(n));
    }
}



