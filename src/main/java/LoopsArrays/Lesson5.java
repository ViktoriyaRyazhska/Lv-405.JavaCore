package SoftServe.LoopsArrays;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {

      int[] arr = {5,-10,100,-2,3,505};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(getMax(arr));
        System.out.println(getSumPositiveNumbers(arr));
        System.out.println(getCountOfNegativeNumbers(arr));
    }

    public static void selectSort(int[] arr){
        for(int index = arr.length-1; index > 0; index--){
            int min = arr[0];
            int minIndex = 0;
            for(int j = 1; j < index; j++){
                if(arr[j] < min ){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[index];
            arr[index] = min;
            arr[minIndex] = temp;
        }
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public static int getSumPositiveNumbers(int[] arr){
      int sumPositiveNumbers = 0;
        for (int i : arr) {
            if(i >= 0){
                sumPositiveNumbers += i;
            }
        }
        return sumPositiveNumbers;
    }

    public static int getCountOfNegativeNumbers(int[] arr){
        int count = 0;
        for (int i : arr) {
            if(i < 0){
                count++;
            }
        }
        return count;
    }
}
