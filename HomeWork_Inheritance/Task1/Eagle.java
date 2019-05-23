package soft.serve;

public class Eagle extends FlyingBird {

	public Eagle(String feathers, int layAggs) {
		super(feathers, layAggs);
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("Eagle can fly");
	}

	@Override
	public String toString() {
		return "Eagle [Feathers colour: " + getFeathers() + ", Number of lay eggs: " + getLayEggs() + "]";
	}

}
