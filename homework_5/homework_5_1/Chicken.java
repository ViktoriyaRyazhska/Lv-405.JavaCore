package homework_5_1;

class Chicken extends NonFlyingBird {

	Chicken(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public String toString() {
		return "Chicken";
	}

}
