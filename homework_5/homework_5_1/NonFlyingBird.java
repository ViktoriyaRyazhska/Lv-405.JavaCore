package homework_5_1;

abstract class NonFlyingBird extends Bird {

	NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	String fly() {
		return "cannot fly";
	}
}
