package Lesson_5;

public class Practical_Array {

	public static void main(String[] args) {
		int[] array= {45, -65, 76, -98,  44, 52, 87, -3, 9, -31};  
		System.out.println("Find maximum");
		int max = array[0];
		int i = 0;
		while (i < array.length) {
			if (array[i] > max) {
				max = array[i];
			}
			i++;
		}
		System.out.println("the biggest of these numbers is " + max);
		System.out.println("--------------------------------------");
		System.out.println();
		
		
		System.out.println("Find the sum of positive numbers in the array");
		int sum = 0;
		int count1=0;
		i = 0;
		System.out.println("Find positive numbers in the array");
		while (i < array.length) {
			if (array[i] > 0) {
				sum = sum + array[i];
				count1++;
				System.out.print(array[i]+" ");
			}
			i++;
		}
		System.out.println();
		System.out.println("the the sum of positive numbers in the array is " + sum);
		System.out.println("--------------------------------------");
		System.out.println();

		
		System.out.println("Find the amount of negative numbers in the array");
		int count2 = 0;
		i = 0;
		System.out.println("Find negative numbers in the array");
		while (i < array.length) {
			if (array[i] < 0) {
				count2++;
				System.out.print(array[i]+" ");
			}
			i++;
		}
		System.out.println();
		System.out.println("the the sum of positive numbers in the array is " + count2);
		System.out.println("--------------------------------------");
		System.out.println();
		
		
		System.out.println("Find maximum: negative or positive");
		if (count1 > count2) {
			System.out.println("Positive numbers are more in the array");
		} else if (count1 < count2) {System.out.println("Negative numbers are more in the array");} else
		
			System.out.println("The same number of positive and negative numbers in the array");
		}
		
		
		
		
	}
	

