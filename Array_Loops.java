package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /////////////////////////////////////////
        //#1/////////////////////////////////////
        /////////////////////////////////////////

        System.out.println("Please enter the number of month");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int month_days[] = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        if (number < 13 && number > 0) {
            System.out.println(month_days[number - 1]);

        } else {
            System.out.println("This month don't exist");


            /////////////////////////////////////////
            //#2/////////////////////////////////////
            /////////////////////////////////////////


            int[] arr = {-5, 3, 6, 23, 34, 1, -5, -66, -8, -1};

            boolean pozitive = true;
            for (int i = 0; i < 5; i++) {
                if (arr[i] < 0) {
                    pozitive = false;
                }
            }
            int summ = 0;
            int pr = 1;
            if (pozitive == true) {
                for (int i = 0; i < 5; i++) {
                    summ += arr[i];
                }
                System.out.println("Sum of first 5 numbers is = " + summ);
            } else {
                for (int i = 5; i < arr.length; i++) {
                    pr *= arr[i];
                }
                System.out.println("Product of last 5 numbers is = " + pr);
            }

            /////////////////////////////////////////
           //#3/////////////////////////////////////
          /////////////////////////////////////////

            int[] arr2 = new int[5];
            System.out.println("Enter 5 integer numbers");
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = Integer.parseInt(scan.nextLine());
            }


            int posN = 0;
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] >= 0) {
                    posN++;
                }
                if (posN == 2) {
                    System.out.println("position of second positive number is " + (i + 1));
                    break;
                }

            }

            int min2 = arr2[0];
            int imin = 0;
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] < min2) {
                    min2 = arr2[i];
                    imin = i;
                }
            }
            System.out.println("Minimum = " + min2 + " on " + (imin + 1) + " place");


            int[] arrPositive = new int[5];
            System.out.println("Enter only pozitive integer numbers");
            for (int i = 0; i < arrPositive.length; i++) {
                arrPositive[i] = Integer.parseInt(scan.nextLine());
                if (arrPositive[i] < 0) {
                    System.out.println("Negative integer number - application will be closed");
                    break;
                }
            }
            int arrPositivePr = 1;
            for (int i = 0; i < arrPositive.length; i++) {
                if (arrPositive[i]!=0 && arrPositive[i]%2==0) {

                    arrPositivePr *= arrPositive[i];
                }
            }
            System.out.println("the product of even entered numbers >0   = " + arrPositivePr);

        }


        }
    }


