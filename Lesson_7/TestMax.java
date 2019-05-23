package Lesson_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMax {
	
	
	public static void main(String[] args) throws Exception
    {
        int[] array1 = initializeArray();

        int max = max1(array1);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        //создаем массив и вводим данные
        int[] array = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(reader.readLine());


        return array;
    }

    public static int max1(int[] array) {

        int maximum = array[0];

        for (int i = 0; i < array.length; i++)
            if (maximum < array[i]) maximum = array[i];
        
        return maximum;
    }

}
