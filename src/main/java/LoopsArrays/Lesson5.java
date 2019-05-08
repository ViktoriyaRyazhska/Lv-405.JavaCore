package SoftServe.LoopsArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lesson5 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int[] arr = {5,-10,100,-2,3,505};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(getMax(arr));
        System.out.println(getSumPositiveNumbers(arr));
        System.out.println(getCountOfNegativeNumbers(arr));

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John",5,2000);
        employees[1] = new Employee("Michel",1,2300);
        employees[2] = new Employee("Bill",5,1400);
        employees[3] = new Employee("Adam",7,1200);
        employees[4] = new Employee("Filip",2,3000);

        System.out.println("All employee witch work in same department");
        int departmentNumber = Integer.parseInt(br.readLine());
        for (Employee e : employees) {
            if(e.getDepartmentNumber() == departmentNumber){
                System.out.println(e);
            }
        }

        System.out.println("Sort employees by salary DESC order ");
        selectSort(employees);
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }




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


    public static void selectSort(Employee[] arr){
            Employee temp;
        for(int index = arr.length-1; index > 0; index--){
            int min = arr[index].getSalary();
            int minIndex = index;
            for(int j = 0; j <= index; j++){
                if(arr[j].getSalary() < min ){
                    min = arr[j].getSalary();
                    minIndex = j;
                }
            }
            System.out.println(min);
            temp = arr[index];
            arr[index] = arr[minIndex];
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
