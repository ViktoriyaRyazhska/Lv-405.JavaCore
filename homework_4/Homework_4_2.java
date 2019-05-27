package homework_4;

public class Homework_4_2 {
	
	// Завдання №2
	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
			
		int[] intnum = {5, 2, -3, 0, -1, 4, -6, 8, -11, 23};
			
		while (a < 5) {
			if (intnum[a] > 0) {
				sum = sum + intnum[a];
				a++;
			} else {
				sum = 0;
				break;
			}
		}
		if (sum == 0) {
			System.out.println("У перших п'яти числах є недодатні.");
		} else {
			System.out.println("Сума перших 5-ти, виключно додатніх, чисел= " + sum);
		}		
	}		
}

