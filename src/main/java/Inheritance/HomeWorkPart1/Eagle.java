package SoftServe.InheritanceHomeWork;

public class Eagle extends FlyingBird {
    public Eagle(String attributes, String feathers) {
        super(attributes, feathers);
    }

    @Override
    public void fly() {
        System.out.print("I am Eagle and I'm ");
        super.fly();
    }
}
