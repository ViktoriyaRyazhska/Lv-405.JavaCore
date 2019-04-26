package SoftServe.CodeWars.Reverse;

import java.util.Arrays;

public class ReverseSequence{

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(8)));
        System.out.println(Arrays.toString(reverse(15)));
        System.out.println(Arrays.toString(reverse(20)));
        System.out.println(Arrays.toString(reverse(5)));
        System.out.println(Arrays.toString(reverse(0)));
    }

    public static int[] reverse(int n){
        if(n == 0){
            return new int[1];
        }

        int[] arr = new int[n];
        int index = 0;
        while (n > 0){
            arr[index++] = n--;
        }
        return arr;
    }
}
