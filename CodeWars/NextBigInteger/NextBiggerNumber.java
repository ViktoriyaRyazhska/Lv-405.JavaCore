package SoftServe.CodeWars.NextBigInteger;

import java.util.Arrays;

public class NextBiggerNumber {
    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(987654341L));

    }



    public static long nextBiggerNumber(long n)
    {
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();

        int index;
        for(index = digits.length-1 ; index > 0; index--){
           if(digits[index] > digits[index -1 ]){
               break;
           }
        }
        if(index == 0){
            return -1;
        }
        else{
            int z = digits[index - 1];
            int min = index;
            for(int j = index + 1; j < digits.length; j++){
                if(digits[j] > z && digits[j] < digits[min] ){
                    min = j;
                }
            }

            swap(digits, index - 1, min);

            Arrays.sort(digits, index, digits.length);
            return Long.parseLong(String.valueOf(digits));

        }

}

    public static void swap(char[] charArray, int indexFirst, int indexSecond){
        char temp = charArray[indexFirst];
        charArray[indexFirst] = charArray[indexSecond];
        charArray[indexSecond] = temp;
    }

}
