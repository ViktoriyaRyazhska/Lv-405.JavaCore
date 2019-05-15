package SoftServe.InheritanceHomeWork;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Swallow("Swallow feather info","Info about eggs");
        birds[1] = new Penguin("Penguin feather info","Info about eggs");
        birds[2] = new Chicken("Chicken feather info","Info about eggs");
        birds[3] = new Eagle("Eagle feather info","Info about eggs");

        for (Bird bird : birds) {
            if(bird instanceof FlyingBird){
                bird.fly();
                System.out.print(bird.getLayEggs() + " " + bird.getFeathers() + '\n');
            }
            else if(bird instanceof NonFlyingBird){
                System.out.print(bird.getLayEggs() + " " + bird.getFeathers() + '\n');
            }
        }

    }
}
