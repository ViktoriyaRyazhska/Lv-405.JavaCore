package soft.serve;

public class FlyingBird extends Bird {

	public FlyingBird(String feathers, int layAggs) {
		super(feathers, layAggs);
	}

	@Override
	public void fly() {
		System.out.println("Flying bird");
	}

}
