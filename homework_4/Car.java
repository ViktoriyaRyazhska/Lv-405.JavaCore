package homework_4;

class Car {
	
	private String marque;
	private String type;
	private int yearofprod; // Чому не можна поставити byte або float ? Дозволяє поставити тільки int або double.
	private double engcap;
	
	// Гетери і сетери.
	String getName() {
		return marque;
	}
	void setName(String name) {
		this.marque = name;
	}
	void setType(String type) {
		this.type = type;
	}
	String getType() {
		return this.type;
	}
	void setYearofprod(int yearofprod) {
		this.yearofprod = yearofprod;
	}
	int getYearofprod() {
		return this.yearofprod;
	}
	void setEngcap(float engcap) {
		this.engcap = engcap;
	}
	double getEngcap() {
		return this.engcap;
	}
	
	// Переписуємо батьківські методи.
	@Override
	public String toString() {
		return marque +", " + type + ", " + yearofprod + " року випуску, об'єм двигуна: " + engcap + "л.";
	}
	
	// Конструктори
	Car(String marque, String type, int yearofprod, double engcap) {
		this.marque = marque;
		this.type = type;
		this.yearofprod = yearofprod;
		this.engcap = engcap;
	}
	
}
