package Test_1;

public class MyClass {

	public static void main(String[] args) {
		Person pers1 = new Person(35);
		System.out.println(pers1);

		Person pers2 = new Person("Dmytro");
		System.out.println(pers2);
		pers2.setName("Dimass");
		System.out.println(pers2);

		Person pers3 = new Person("Andry", 35);
		System.out.println(pers3);
		pers3.setAge(55);
		System.out.println(pers3);

		double n = Person.avgage();
		double s = Person.sum;
		double c = Person.count;
		System.out.println(c);
		System.out.println(s);
		System.out.println(n);
	}

}
