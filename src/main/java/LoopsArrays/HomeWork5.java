package SoftServe.LoopsArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWork5 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static Car[] cars = new Car[7];
    static {
        cars[0] = new Car("model_1","type_1",2001,1600);
        cars[1] = new Car("model_2","type_2",2001,1500);
        cars[2] = new Car("model_3","type_3",1998,1900);
        cars[3] = new Car("model_4","type_4",2005,2600);
        cars[4] = new Car("model_5","type_5",2002,1500);
        cars[5] = new Car("model_6","type_6",2005,1600);
        cars[6] = new Car("model_7","type_7",2010,3100);
    }
    private static int[] arr = {-5, -1, 2, 5, 12, 25, 1, 4, 1, 2};

    public static void main(String[] args){
        try {

            System.out.println("---------------1----------------");
            System.out.println("Enter number of month and get prize, days array or null :)");
            int monthNum = Integer.parseInt(br.readLine());
            int[] prize = getDaysArray(monthNum,true);
            if(prize != null){
                System.out.println("Congratulation!");
            }else {
                System.out.println("Better luck next time :)");
            }
            System.out.println("---------------2----------------");
            System.out.println("Calculate the sum of first 5 elements if " +
                    "they are positive or product of last 5 element in the other case.");
            int result = calculateSumOrProductOfNumbersArr(arr);
            System.out.println("We've get = " + result);

            System.out.println("---------------3.1----------------");
            int positionSecPosNumber = positionOfSecondPositiveNumber(arr);
            System.out.println("We have array " + Arrays.toString(arr));
            System.out.println("Position of second positive number is " + positionSecPosNumber);
            System.out.println("---------------3.2----------------");
            int[] minAndPos = getMinElemAndItPosition(arr);
            System.out.println("Min elem is " + minAndPos[0]);
            System.out.println("Min elem position is " + minAndPos[1]);

            System.out.println("---------------4----------------");
            System.out.println("Lets play with console :)");
            int prodEvenNumber = productOfEvenNumberFromConsoleInput(br);
            System.out.println("Produce of all even numbers from console equal " + prodEvenNumber);

            System.out.println("---------------5.1----------------");
            System.out.println("End last let's play with car");
            System.out.print("Model year = ");
            int modelYear = Integer.parseInt(br.readLine());
            showCarsWithCertainModelYear(cars, modelYear);
            System.out.println("---------------5.2----------------");
            System.out.println("Cars ordered by year: ");
            orderedCarsByYear(cars);
            for (Car car : cars) {
                System.out.println(car);
            }

        }catch (IllegalArgumentException | NullPointerException | IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("The end :)");
        }



    }


    /**
     * Sort car by year use quick sort
     * @param cars;
     * @throws IllegalArgumentException if argument is null
     * @throws NullPointerException if some array element contains null reference
     */
    public static void orderedCarsByYear(Car[] cars)throws IllegalArgumentException, NullPointerException{
        if(cars == null){
            throw new IllegalArgumentException("Car array cannot be null");
        }
        quickSort(cars);
    }

    /**
     * @param cars Car[] arr, cannot be null
     * @param modelYear;
     * @throws IllegalArgumentException if first argument is null
     * @throws NullPointerException if some array element contains null reference
     */
    public static void showCarsWithCertainModelYear(Car[] cars, int modelYear)throws IllegalArgumentException, NullPointerException{

        if(cars == null){
            throw new IllegalArgumentException("Car array cannot be null");
        }

        for (Car car : cars) {
            //for this task it is ok but if we had many cars I would have done differently
            if (car.getYearOfProduction() == modelYear) {
                System.out.println(car);
            }
        }
    }

    /**
     * @param br cannot be null
     * @return Product of all even number from user input orr -1 if not such even number
     * @throws IllegalArgumentException if BufferedReader is null or parseInt method cannot parse element from input
     * @throws IOException readLine method can throw it
     */
    public static int productOfEvenNumberFromConsoleInput(BufferedReader br)throws IllegalArgumentException, IOException{

        if(br == null){
            throw new IllegalArgumentException("BufferedReader cannot be null");
        }

            int value;
            int productEvenNumbers = 1;
            boolean isEven = false;
            while ((value = Integer.parseInt(br.readLine())) > -1) {
                if(value % 2 == 0){
                    isEven = true;
                    productEvenNumbers *= value;
                }
            }

            return isEven ? productEvenNumbers : -1;
        }


    /**
     * @param arr Can't be null or array size less then 1
     * @return Array witch has two elem - first is min elem and second is position in passed array min elem
     * @throws IllegalArgumentException If argument is null or arr.length < 1
     */
    public static int[] getMinElemAndItPosition(int[] arr)throws IllegalArgumentException {
        if(arr == null || arr.length < 1){
            throw new IllegalArgumentException("Array cannot be null and can't have length less than 1");
        }

        int[] result = new int[2];
        int min = arr[0];
        int positOfMinVal = 0;

        if(arr.length == 1){
             result[0] = min;
             return result;
        }

        for (int index = 1; index < arr.length; index++) {
            if(arr[index] < min){
                min = arr[index];
                positOfMinVal = index;
            }
        }

        result[0] = min;
        result[1] = positOfMinVal;

        return result;
    }

    /**
     * @param arr Can't be null or array size less then 1
     * @return Position of second positive element in array or -1 if there is not such element
     * @throws IllegalArgumentException If argument is null or arr.length < 1
     */
    public static int positionOfSecondPositiveNumber(int[] arr) throws IllegalArgumentException{
        if(arr == null || arr.length < 1){
            throw new IllegalArgumentException("Array cannot be null and can't have length less than 1");
        }

        int positiveElemCounter = 0;
        for(int index = 0;index < arr.length; index++){
            if(arr[index] >= 0){
                positiveElemCounter++;
            }
            if(positiveElemCounter == 2){
                return index;
            }
        }

       return -1;
    }

    /**
     * @param monthNumber Can be from 1 to 12
     * @return An empty array whose size is equal to
     * the number of days in the month passed in
     * the argument or NULL if number of month < 1 or > 12
     */
    public static int[] getDaysArray(int monthNumber, boolean isLeapYear){
        switch (monthNumber){
            case 1:  return new int[31];
            case 2:  return isLeapYear ? new int[29] : new int[28];
            case 3:  return new int[31];
            case 4:  return new int[30];
            case 5:  return new int[31];
            case 6:  return new int[30];
            case 7:  return new int[31];
            case 8:  return new int[31];
            case 9:  return new int[30];
            case 10: return new int[31];
            case 11: return new int[30];
            case 12: return new int[31];
                default: return null;
        }
    }

    /**
     * @param arr Can't be null or array size less then 10
     * @return Sum of first half array elements or product last half array element
     * @throws IllegalArgumentException If argument is null or array length < 10
     */
    public static int calculateSumOrProductOfNumbersArr(int[] arr) throws IllegalArgumentException{
        if(arr == null || arr.length < 10){
            throw new IllegalArgumentException("Array cannot be null and can't have length less than 10");
        }

        boolean isFirstFiveNegative = false;
        for (int index = 0; index < arr.length/2; index++) {
            if(arr[index] < 0){
                isFirstFiveNegative = true;
            }
        }

        if(isFirstFiveNegative){
            int product = 1;
            for (int index = arr.length/2; index < arr.length; index++){
                product *= arr[index];
            }
            return product;
        }
        else{
            int sum = 0;
            for(int index = 0; index < arr.length/2; index++){
                sum += arr[index];
            }
            return sum;
        }
    }



    private static void quickSort(Car[] arr){
        helperQuickSort(arr, 0, arr.length);
    }

    private static void helperQuickSort(Car[] arr, int start, int end){

        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(arr, start, end);
        helperQuickSort(arr,start,pivotIndex);
        helperQuickSort(arr,pivotIndex+1,end);

    }

    private static int partition(Car[] arr, int start, int end){
        Car pivotCar = arr[start];
        int pivot = arr[start].getYearOfProduction();
        int i = start;
        int j = end;

        while(i < j ){
            // this empty loop helps me find first element witch less then or equal to pivot element
            while(i < j && arr[--j].getYearOfProduction() >= pivot){}

            if (i < j){
                arr[i] = arr[j];
            }

            // this empty loop helps me find first element witch greater then or equal to pivot element
            while (i < j && arr[++i].getYearOfProduction() <= pivot){}

            if(i < j){
                arr[j] = arr[i];
            }
        }

        arr[j] = pivotCar;
        return j;
    }

}
