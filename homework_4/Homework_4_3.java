package homework_4;

public class Homework_4_3 {
	
	public static void main(String[] args) {
		
		// 1-е завдання.
		int[] intnum = {5, -4, 1, -13, 0};
		
		int a;
		int b = 0;
		int ournumofpos = 1;

		for (a = 0; a < intnum.length; a++) {
			
			if (intnum[a] > 0) {	
				if (b == ournumofpos) {		
					break;	
				}
				b++;
			}
		}
		
		if (b == ournumofpos && a < intnum.length) {
			System.out.println("Друге додатнє число= " + intnum[a] + "; на позиції: " + (a + 1) + ".");
		} else if (b == ournumofpos && a >= intnum.length) {
			System.out.println("Другого додатнього числа у базі даних немає.");
		}	
		
		// 2-ге завдання.
		int minnum = intnum[0];
		
		for (a = 0; a < intnum.length; a++) {
				if (intnum[a] < minnum) {
					minnum = intnum[a];
				}
		}
		System.out.println("Мінімальне число: " + minnum);
	}
}
