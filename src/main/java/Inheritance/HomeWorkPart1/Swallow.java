package SoftServe.InheritanceHomeWork;

public class Swallow extends FlyingBird {
    public Swallow(String attributes, String feathers) {
        super(attributes, feathers);
    }

    @Override
    public void fly() {
        System.out.print("I am Swallow and I'm ");
        super.fly();
    }
}
