package Test_1;

public class Person {
	private String name;
	private int age;
	
	public static int count = 0;
	public static int sum = 0;
		
	public Person () {count++;}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
		sum = sum + age;
	}
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
		count++;
		sum = sum + age;
	}
	public Person(int age) {
		this.age = age;
		count++;
		sum = sum + age;
	}
	public Person(String name) {
		this.name = name;
		count++;
	}
	public String getName() {
		return name;		
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		sum = sum - this.age;
		this.age = age;
		sum = sum + age;
	}
	public void setName(String name, int age) {
		this.name = name;
		sum = sum - this.age;
		this.age = age;
		sum = sum + age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static double avgage() {
		return sum/(double)count;
	}
}
