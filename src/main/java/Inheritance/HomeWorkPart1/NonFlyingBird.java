package SoftServe.InheritanceHomeWork;

public abstract class NonFlyingBird extends Bird{

    @Override
    public void fly() throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Thees kind if birds cannot fly");
        // or better way use interface flyable it's give us more safety and flexible;
    }

    public NonFlyingBird(String attributes, String feathers) {
        super(attributes, feathers);
    }

}
