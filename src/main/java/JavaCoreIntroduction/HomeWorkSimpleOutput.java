package JavaCoreIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HomeWorkSimpleOutput {
    private final static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
         String name;
         String address;

         try {

             System.out.println("What is your name?");
             name = consoleReader.readLine();
             System.out.println("Where are you live, " + name + "?");
             address = consoleReader.readLine();
             System.out.println("Name = " + name);
             System.out.println("Address = " + address);

         }catch (IOException e){
             e.printStackTrace();
         }
    }
}
