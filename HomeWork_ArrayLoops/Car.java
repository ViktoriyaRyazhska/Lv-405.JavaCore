package soft.serve;

public class Car {

	private String type;
	private int yearOfProduction;
	private int capasity;

	public Car() {
	}

	public Car(String type, int yearOfProduction, int capasity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.capasity = capasity;
	}

	public String getType() {
		return type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public int getCapasity() {
		return capasity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", capasity=" + capasity + "]" + "\n";
	}

}