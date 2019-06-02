import java.io.IOException;

public class MonthNumber {

    public static String getDayAmountInMonth() throws IOException {
        int month_days[] = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        String[] month_name = new String[]{"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};

        int month_number = Integer.parseInt(Main.br.readLine());

        switch (month_number) {
            case 1:
                return "In " + month_name[0] + " " + month_days[0] + " days";

            case 2:
                return "In " + month_name[1] + " " + month_days[1] + " days";

            case 3:
                return "In " + month_name[2] + " " + month_days[2] + " days";

            case 4:
                return "In " + month_name[3] + " " + month_days[3] + " days";

            case 5:
                return "In " + month_name[4] + " " + month_days[4] + " days";

            case 6:
                return "In " + month_name[5] + " " + month_days[5] + " days";

            case 7:
                return "In " + month_name[6] + " " + month_days[6] + " days";

            case 8:
                return "In " + month_name[7] + " " + month_days[7] + " days";

            case 9:
                return "In " + month_name[8] + " " + month_days[7] + " days";

            case 10:
                return "In " + month_name[9] + " " + month_days[9] + " days";

            case 11:
                return "In " + month_name[10] + " " + month_days[10] + " days";

            case 12:
                return "In " + month_name[11] + " " + month_days[11] + " days";


            default:
                return "You enter wrong month number";

        }
    }
}
