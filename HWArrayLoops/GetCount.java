public class GetCount {

    public static int getSumPositive() {


        int sum = 0;

        for (int i = 0; i <= 5; i++) {
            if (Main.arr[i] > 0) {
                sum += Main.arr[i];
            }

        }
        return sum;

    }

    public static int getProduct() {

        int product = 0;

        for (int i = 0; i < Main.arr.length; i++) {
            product = product * Main.arr[i];

        }
        return product;
    }


}
