package Task;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal[] animal   = new Animal[5];
			animal[0] = new Cat();
			animal [1] = new Dog();
			animal [2] = new Dog();
			animal [3] = new Cat();
			animal [4] = new Dog();
			
			for (int i = 0; i < animal.length; i++) {
				animal[i].voice();
				
			}
			
			for (int i = 0; i < animal.length; i++) {
				animal [i].feed();
			}
			
			
		
		

	}

}
