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

	@Before // �� ������� �������� ���� "float" �� @Before.
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
			System.out.println("�������� �����= " + a);
		} else if (a < b && c < b) {
			System.out.println("�������� �����= " + b);
		} else if (a < c && b < c) {
			System.out.println("�������� �����=" + c);
		} else if (a == b && a > c) {
			System.out.println("�������� ����� : " + a + " � " + b);		
		} else if (b == c && b > a) {
			System.out.println("�������� ����� : " + b + " � " + c);
		} else if (c == a && c > b) {
			System.out.println("�������� ����� : " + c + " � " + a);
		}
		
		if (b > a && c > a) {
			System.out.println("�������� �����= " + a);
		} else if (a > b && c > b) {
			System.out.println("�������� �����= " + b);
		} else if (a > c && b > c) {
			System.out.println("�������� �����= " + c);
		} else if (a == b && a < c) {
			System.out.println("�������� ����� : " + a + " � " + b);		
		} else if (b == c && b < a) {
			System.out.println("�������� ����� : " + b + " � " + c);
		} else if (c == a && c < b) {
			System.out.println("�������� ����� : " + c + " � " + a);
		} else {
			System.out.println("�� ���� �����-- ���");
		}
	}
	
	@Test
	public void test3() throws IOException {
		System.out.println("������ ����� ���� HTTP- �������, � ��������� �����");
		System.out.println("400, 401, 402, 403, 404");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short hter = Short.parseShort(br.readLine());
		Methods_4_1.errorName(hter);

	}
}