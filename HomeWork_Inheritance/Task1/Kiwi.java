package soft.serve;

public class Kiwi extends NonFlyingBird {

	public Kiwi(String feathers, int layAggs) {
		super(feathers, layAggs);
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("Kiwi can't fly");
	}

	@Override
	public String toString() {
		return "Kiwi [Feathers colour: " + getFeathers() + ", Number of lay eggs: " + getLayEggs() + "]";
	}

	

}
