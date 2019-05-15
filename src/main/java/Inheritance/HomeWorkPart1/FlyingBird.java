package SoftServe.InheritanceHomeWork;

public abstract class FlyingBird  extends Bird{

    public FlyingBird(String attributes, String feathers) {
        super(attributes, feathers);
    }

    @Override
    public void fly() {
        System.out.println("flying.....");
    }
}
