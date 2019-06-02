public class GetMin {


    public static String getMinElemPosition() throws IllegalArgumentException {

        int positionMin = 0;
        int valueMin = 0;
        for (int index = 0; index < Main.arr.length; index++) {
            if (Main.arr[index] < Main.arr[positionMin]) {
                positionMin = index;
                valueMin = Main.arr[index];
            }
        }

        return "Min value is: " + valueMin + " and it`s " + positionMin + " in array.";
    }
}
