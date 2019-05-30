package homework_5_1;

class Penguin extends NonFlyingBird{

	Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public String toString() {
		return "Penguin";
	}

}
