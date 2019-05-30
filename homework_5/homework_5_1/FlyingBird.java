package homework_5_1;

abstract class FlyingBird extends Bird {

	FlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	String fly() {
		return "can fly";
	}

}
