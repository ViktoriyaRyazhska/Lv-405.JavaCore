package homework_4_1;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_Homework_4_1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before // Не вдалося вставити поля "float" під @Before.
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		float a = 2;
		float b = 0;
		float c = -4;
		assertTrue((-5 <= a && a <= 5) && (-5 <= b && b <= 5) && (-5 <= c && c <= 5));
	}
	
	@Test
	public void test2() {
		float a = 2;
		float b = 2;
		float c = 2;
		
		if (b < a && c < a) {
			System.out.println("Найбільше число= " + a);
		} else if (a < b && c < b) {
			System.out.println("Найбільше число= " + b);
		} else if (a < c && b < c) {
			System.out.println("Найбільше число=" + c);
		} else if (a == b && a > c) {
			System.out.println("Найбільші числа : " + a + " і " + b);		
		} else if (b == c && b > a) {
			System.out.println("Найбільші числа : " + b + " і " + c);
		} else if (c == a && c > b) {
			System.out.println("Найбільші числа : " + c + " і " + a);
		}
		
		if (b > a && c > a) {
			System.out.println("Найменше число= " + a);
		} else if (a > b && c > b) {
			System.out.println("Найменше число= " + b);
		} else if (a > c && b > c) {
			System.out.println("Найменше число= " + c);
		} else if (a == b && a < c) {
			System.out.println("Найменші числа : " + a + " і " + b);		
		} else if (b == c && b < a) {
			System.out.println("Найменші числа : " + b + " і " + c);
		} else if (c == a && c < b) {
			System.out.println("Найменші числа : " + c + " і " + a);
		} else {
			System.out.println("Усі ваші числа-- рівні");
		}
	}
	
	@Test
	public void test3() throws IOException {
		System.out.println("Введіть номер вашої HTTP- помилки, з наведених нижче");
		System.out.println("400, 401, 402, 403, 404");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short hter = Short.parseShort(br.readLine());
		Methods_4_1.errorName(hter);

	}
}