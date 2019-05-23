package soft.serve;

public abstract class Bird {
	private String feathers;
	private int layEggs;
	
	public abstract void fly();

	public Bird(String feathers, int layAggs) {
		this.feathers = feathers;
		this.layEggs = layAggs;
	}
	
	public Bird() {
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public int getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(int layAggs) {
		this.layEggs = layAggs;
	}
	
	
	

}
