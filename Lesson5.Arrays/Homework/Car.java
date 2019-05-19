package Homework;

public class Car {
	private String type;
	private int year;
	private double engine;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public Car(String type, int year, double engine) {
		super();
		this.type = type;
		this.year = year;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", engine=" + engine + "]";
	}
	
	

}
