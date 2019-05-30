package homework_5_1;

class Homework_5_1 {
	public static void main(String[] args) {
		
		FlyingBird e1 = new Eagle("green", "1-2");
		FlyingBird s1 = new Swallow("yelow", "2-3");
		NonFlyingBird p1 = new Penguin("white", "1-3");
		NonFlyingBird c1 = new Chicken("blue", "3-7");
		
		Bird[] bird = {e1, s1, p1, c1};
		
		for(int a = 0; a < bird.length; a++) {
			System.out.print(bird[a] + " has " + bird[a].getFeathers() + " feathers, lays " + bird[a].getLayEggs() + " eggs,");
			System.out.println(" and " + bird[a].fly() + ".");
		}
	}
}
