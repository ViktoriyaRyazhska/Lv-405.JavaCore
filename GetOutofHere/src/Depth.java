import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Depth {

    final int MAX = 100;//max amount of connections


    FlightInfo flights[] = new FlightInfo[MAX];//масив який містить інформацію про політ
    int numFlights = 0; //кількість елементів в масиві
    Stack btStack = new Stack();//стек повернень

    public static void main(String[] args) throws IOException {

        String from, to;
        Depth ob = new Depth();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ob.setup();
        try {
            System.out.println("From ?");
            from = br.readLine();
            System.out.println("To ?");
            to = br.readLine();
            ob.isflight(from, to);
            if (ob.btStack.size() != 0)
                ob.route(to);
        } catch (IOException exc) {
            System.out.println("Error in input");
        }

    }

    void setup() {
        addFlight("Львів", "Тернопіль", 130);
        addFlight("Тернопіль", "Збараж", 17);
        addFlight("Збараж", "Луб'янки", 7);
        addFlight("Луб'янки", "Рогівець", 12);

    }

    void addFlight(String from, String to, int distance) {
        if (numFlights < MAX) {
            flights[numFlights] = new FlightInfo(from, to, distance);
            numFlights++;
        } else System.out.println("Flight database full .\n");

    }

    void route(String to) {
        Stack rev = new Stack();
        int dist = 0;
        FlightInfo f;
        int num = btStack.size();
        //Зробити реверс стека для відображення маршруту
        for (int i = 0; i < num; i++)
            rev.push(btStack.pop());
        for (int i = 0; i < num; i++) {
            f = (FlightInfo) rev.pop();
            System.out.println(f.from + " to ");
            dist += f.distance;

        }
        System.out.println(to);
        System.out.println("Distance is " + dist);
    }

    int match(String from, String to) {
        for (int i = numFlights - 1; i > -1; i--) {
            if (flights[i].from.equals(from) &&
                    flights[i].to.equals(to) && !flights[i].skip) {
                //попередження повтоного викристання
                flights[i].skip = true;
                return flights[i].distance;
            }

        }
        return 0;//нема зв*язку
    }

    FlightInfo find(String from) {
        for (int i = 0; i < numFlights; i++) {
            if (flights[i].from.equals(from) && !flights[i].skip) {

                FlightInfo f = new FlightInfo(flights[i].to, flights[i].from, flights[i].distance);
                flights[i].skip = true;
                return f;

            }

        }
        return null;

    }

    /* Визнвчити чи є шлях між from and to, використвоуючи пошук в ширину

     */
    void isflight(String from, String to) {

        int dist, dist2;
        FlightInfo f;

        //Цей стек необхдіний при пошуку в ширину
        Stack resetStck = new Stack();
        //Перегляд наявності пункту відправлення
        dist = match(from, to);
        if (dist != 0) {
            btStack.push(new FlightInfo(from, to, dist));
            return;
        }

        /* Фрагмент нижче є першою модифікованою частиною для пошука в ширину.
         Тут проводиться провірка всіх маршрутів із заданого вузла

         */

        while ((f = find(from)) != null) {
            resetStck.push(f);
            if ((dist = match(f.to, to)) != 0) {
                resetStck.push(f.to);
                btStack.push(new FlightInfo(from, f.to, f.distance));
                btStack.push(new FlightInfo(f.to, to, dist));
                return;
            }
        }
        /* В наступному коді проводиться перевстановлення полів skip, встановлених в попередньому циклі.
        Ця частина також модифікована для пошука в ширину
         */

        int i = resetStck.size();
        for (; i != 0; i--)
            resetSkip((FlightInfo) resetStck.pop());
        //Попробувати інший маршрут
        f = find(from);
        if (f != null) {
            btStack.push(new FlightInfo(from, to, f.distance));
            isflight(f.to, to);
        } else if (btStack.size() > 0) {
            f = (FlightInfo) btStack.pop();
            isflight(f.from, f.to);
        }
    }

    void resetSkip(FlightInfo f) {
        for (int i = 0; i < numFlights; i++)
            if (flights[i].from.equals(f.from) && flights[i].to.equals(f.to)) flights[i].skip = false;


    }


}



