import java.io.IOException;

class OnlyPositive {

    public static int getPositive() throws IOException {

        int statement = 1;
        int product = 1;
        int a = 0;


        while (statement >= 0) {
            System.out.println("Please, enter positive integer ");
            statement = Integer.parseInt(Main.br.readLine());
            if (statement >= 0 && (statement % 2) == 0) {
                product = product * statement;
                a++;
            } else if (statement < 0) {
                break;
            }
        }
        return product;
    }

}