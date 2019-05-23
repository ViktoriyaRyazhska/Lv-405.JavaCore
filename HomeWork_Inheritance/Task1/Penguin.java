package soft.serve;

public class Penguin extends NonFlyingBird {
	public Penguin(String feathers, int layAggs) {
		super(feathers, layAggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("Penguin can't fly");
	}

	@Override
	public String toString() {
		return "Penguin [Feathers colour: " + getFeathers() + ", Number of lay eggs: " + getLayEggs() + "]";
	}

}
