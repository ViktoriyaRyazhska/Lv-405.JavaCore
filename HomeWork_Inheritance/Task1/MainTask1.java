package soft.serve;

public class MainTask1 {

	public static void main(String[] args) {
		Bird[] birds = new Bird[4];

		birds[0] = new Eagle("Brown and black", 3);
		birds[1] = new Swallow("White", 4);
		birds[2] = new Kiwi("Dark brown", 4);
		birds[3] = new Penguin("White and black", 4);

		for (Bird bird : birds) {
			bird.fly();
			System.out.println(bird + "\n");
		}
	}

}
