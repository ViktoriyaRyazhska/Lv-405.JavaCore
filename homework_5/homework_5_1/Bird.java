package homework_5_1;

abstract class Bird {
	private String feathers;
	private String layEggs;

	abstract String fly();

	Bird(String feathers, String layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public String getFeathers() {
		return feathers;
	}
	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}
	public String getLayEggs() {
		return layEggs;
	}
	public void setLayEggs(String layEggs) {
		this.layEggs = layEggs;
	}
	
	@Override
	public abstract String toString();
}