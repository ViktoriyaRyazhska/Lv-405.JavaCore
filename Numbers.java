package Task;

public class Numbers {
	private int a;
	private static int summ = 0;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
		if (this.a % 2 == 0) {
			summ++;
		}
	}

	public Numbers() {
	}

	public static void getSumm() {
		System.out.println(summ);
	}

}
