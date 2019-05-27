package SoftServe.Exception;


import java.io.PrintStream;

public class MainException {


    public static void main(String[] args) {
        try {

            int recSquare = squareRectangle(-1, 2);

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        PrintStream pr = new PrintStream(System.out);

        pr.println("Some text");
        try{
            Plants plant = new Plants("rose", "green", 2);
            Plants plant2 = new Plants("rose", "yellow", 2);

        }catch (ColorException | TypeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    private static int squareRectangle(int a, int b) throws IllegalArgumentException{
        if(a < 0 | b < 0){
            throw new IllegalArgumentException("Argument's cannot be negative");
        }

        return a * b;

    }


}
