package SoftServe.ConditionalStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson4HomeWork {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static double a, b, c;
    private static int a2, b2 ,c2;

    public static void main(String[] args) {

        try {

            System.out.println("------------task1-------------------");
            System.out.println("Check if all numbers are in the range [-5:5] ");
            numberInitializationDouble();
            System.out.println("isBelongToRange() = " + isBelongToRange(a, b, c));
            System.out.println("------------task2-------------------");
            System.out.println("Find max from three values ");
            numberInitializationInt();
            System.out.println("getMax() = " + getMax(a2, b2, c2));

            System.out.println("------------task3-------------------");
            System.out.println("Find min from three values ");
            numberInitializationInt();
            System.out.println("getMin() = " + getMin(a2, b2, c2));

            System.out.println("------------task4-------------------");
            System.out.println("Get correct error message ");
            System.out.print("Enter error code: ");
            int errorMessageNumber = Integer.parseInt(br.readLine());
            System.out.println("getErrorName() = " + getErrorName(errorMessageNumber));

            System.out.println("------------task5-------------------");
            Dog dog1 = new Dog("Rex",2, Dog.breeds.GERMAN_SHEPHERD);
            Dog dog2 = new Dog("July",2, Dog.breeds.POODLE);
            Dog dog3 = new Dog("Nick",5, Dog.breeds.LABRADOR_RETRIEVER);
            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);

            System.out.println("Dog name is unique? : " + isDogNameUnique(dog1,dog2,dog3));

            Dog oldestDog = getOldestDog(dog1,dog2,dog3);
            System.out.println("Oldest dog is : " + oldestDog.getName() + " " + oldestDog.getBreed());



        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static boolean isBelongToRange(double a, double b, double c){
        return (a >= -5.0 && a <= 5.0) && (b >= -5.0 && b <= 5.0) && (c >= -5.0 && c <= 5.0);
    }

    public static int getMax(int a, int b, int c){
        return (a >= b && a >= c) ? a : (b >= c ) ? b : c;
    }

    public static int getMin(int a, int b, int c){
        return (a <= b && a <= c) ? a : (b <= c) ? b : c;
    }

    public static Dog getOldestDog(Dog dog1, Dog dog2, Dog dog3){

        int dog1Age = dog1.getAge();
        int dog2Age = dog2.getAge();
        int dog3Age = dog3.getAge();

        return (dog1Age >= dog2Age && dog1Age >= dog3Age) ? dog1 : (dog2Age >= dog3Age ) ? dog2 : dog3;

        // Or we can invoke getMax method and do like this:
        //PS I suppose one more method invocation I'ts not good idea, but mb. more clean code;
        /*
        int maxOldValue = getMax(dog1Age,dog2Age,dog3Age);
        return dog1Age == maxOldValue ? dog1 : (dog2Age == maxOldValue) ? dog2 : dog3;
        */
    }

    public static String getErrorName(int errorNumber){
        switch (errorNumber){
            case 400: return HTTPError.BAD_REQUEST.getErrorName();
            case 401: return HTTPError.UNAUTHORIZED.getErrorName();
            case 402: return HTTPError.PAYMENT_REQUIRED.getErrorName();
            case 403: return HTTPError.FORBIDDEN.getErrorName();
            case 404: return HTTPError.NOT_FOUND.getErrorName();
            case 405: return HTTPError.METHOD_NOT_ALLOWED.getErrorName();
            default: return null;
        }
    }

    public static boolean isDogNameUnique(Dog dog1, Dog dog2, Dog dog3){
        if(dog1.getName().equals(dog2.getName())){
            return false;
        }else{
            return !dog2.getName().equals(dog3.getName());
        }
    }




    private static void numberInitializationDouble() throws IOException{
        System.out.print("a = ");
        a = Double.parseDouble(br.readLine());
        System.out.print("b = ");
        b = Double.parseDouble(br.readLine());
        System.out.print("c = ");
        c = Double.parseDouble(br.readLine());
    }

    private static void numberInitializationInt() throws IOException{
        System.out.print("a = ");
        a2 = Integer.parseInt(br.readLine());
        System.out.print("b = ");
        b2 = Integer.parseInt(br.readLine());
        System.out.print("c = ");
        c2 = Integer.parseInt(br.readLine());
    }


    private enum HTTPError{

        BAD_REQUEST(400,"Bad Request"),
        UNAUTHORIZED(401,"Unauthorized"),
        PAYMENT_REQUIRED(402,"Payment Required"),
        FORBIDDEN(403,"Forbidden"),
        NOT_FOUND(404,"Not Found"),
        METHOD_NOT_ALLOWED(405,"Method Not Allowed");

        private int errorCode;
        private String errorName;

        HTTPError(int errorCode, String errorName) {
            this.errorCode = errorCode;
            this.errorName = errorName;
        }

        int getErrorCode(){
            return this.errorCode;
        }

        public String getErrorName() {
            return errorName;
        }
    }
}
