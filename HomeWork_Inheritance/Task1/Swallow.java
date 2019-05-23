package soft.serve;

public class Swallow extends FlyingBird {

	public Swallow(String feathers, int layAggs) {
		super(feathers, layAggs);
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("Swallow can fly");
	}

	@Override
	public String toString() {
		return "Swallow [Feathers colour: " + getFeathers() + ", Number of lay eggs: " + getLayEggs() + "]";
	}
	
	
}
