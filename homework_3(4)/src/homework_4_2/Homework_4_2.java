package homework_4_2;

import java.io.IOException;

class Homework_4_2 {
				
	public static void main(String[] args) throws IOException {
		
		System.out.println("������ ��'� ���� ����� ������");
		Dog dog1 = new Dog();
		System.out.println("1) " + dog1);
		System.out.println();
		
		System.out.println("������ ��'� ���� ����� ������");		
		Dog dog2 = new Dog();
		System.out.println("1) " + dog1);
		System.out.println("2) " + dog2);
		System.out.println();
		
		System.out.println("������ ��'� ���� ������ ������");
		Dog dog3 = new Dog();
		System.out.println("1) " + dog1);
		System.out.println("2) " + dog2);
		System.out.println("3) " + dog3);
		System.out.println();
		
		System.out.println("�� ���������� ����� � �������� ����� ?");  // ������ �� ������ ���� "==". � ���� �������� �����, ����, �� ���� �� ����������, ����, getName() �������, �� �� ���� �������� � ���� ���� ��'���� ����� Dog.
//1�����		String nameequals = dog1.getName() == dog2.getName() || dog2.getName() == dog3.getName() || dog3.getName() == dog1.getName() ? "���, ����������" : "ͳ, �� ����������";
//		System.out.println("³������: " + nameequals) ;
		
//2�����		if (dog1.getName() == dog2.getName() || dog2.getName() == dog3.getName() || dog3.getName() == dog1.getName()) {
//			System.out.println("³������: ���, ����������");
//		} else {
//			System.out.println("³������: �, �� ����������");
//		}
//		System.out.println();
		
//3�����		System.out.println(Dog.sameNames(dog1, dog2, dog3));
		
// ���� ��������� ��'���� ����� ����� "Dog(String name, Enbreed breed, int age)", ��� ��� ������ � ����� ������� ��������.

// � �����, � �������, �� �� �������� � "getName", ������ �������� � "getAge".
		System.out.println("��� ������ ��������� ?");
		if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println("��������� " + dog1);
		} else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
			System.out.println("��������� " + dog2);
		} else if (dog3.getAge() > dog2.getAge() && dog3.getAge() > dog1.getAge()) {
			System.out.println("��������� " + dog3);
		} else if (dog1.getAge() == dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println("���������, �� ������:");
			System.out.println(dog1);
			System.out.println(dog2);
		} else if (dog2.getAge() == dog3.getAge() && dog2.getAge() > dog1.getAge()) {
			System.out.println("���������, �� ������:");
			System.out.println(dog2);
			System.out.println(dog3);
		} else if (dog3.getAge() == dog1.getAge() && dog3.getAge() > dog2.getAge()) {
			System.out.println("���������, �� ������:");
			System.out.println(dog3);
			System.out.println(dog1);
		} else {
			System.out.println("�� ���� ������ ������ ���");
			System.out.println(dog1);
			System.out.println(dog2);
			System.out.println(dog3);
		}
				
	}

}
		
