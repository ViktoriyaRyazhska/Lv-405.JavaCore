package soft.serve;

public class NonFlyingBird extends Bird {
	public NonFlyingBird(String feathers, int layAggs) {
		super(feathers, layAggs);
	}

	@Override
	public void fly() {
		System.out.println("Non flying bird");
	}


}
