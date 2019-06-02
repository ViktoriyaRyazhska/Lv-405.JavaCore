public class GetPosition {


    public static String getPosition() {

        int positivecounter = 0;
        for (int index = 0; index < Main.arr.length; index++) {
            if (Main.arr[index] > 0) {
                positivecounter++;
            }

            if (positivecounter == 2) {
                return "Second positive number is: " + Main.arr[index] + " and it`s position in array " + index;

            }

        }
        return "";
    }
}
