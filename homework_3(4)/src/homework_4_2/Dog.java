package homework_4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dog {
	private String name;
	private Enbreed breed;
	private int age;
	
	enum Enbreed {
		�������, �����, ����, ��������, ���;
	}
	
	Dog() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		
		name = br.readLine();
		System.out.println("������ ������ ������ " + name + " �� �������������� �����");
		System.out.println("³������, ϳ����, ����, ��������, ���");
		String strbreed = br.readLine();
		breed = Enbreed.valueOf(strbreed.toLowerCase());
		System.out.println("������ �� ������ " + name + " (������ ����� ����)");
		age = Integer.parseInt(br.readLine());
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Enbreed getBreed() {
		return breed;
	}
	public void setBreed(Enbreed breed) {
		this.breed = breed;
	}	
	public int getAge() {
		return age;
	}	
	public void setAge(byte age) {
		this.age = age;
	}
	// ^ ������ � ������
	
	Dog(String name, Enbreed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;	
	}
	
	// ����� ��������� (���� �������� ����� � ���� Homework_4_2), �� ������ ������� �����, ��� ���������� �����. �� ������ (. ��� ���� �������� ��� �� ����� "else" � �������� ��, �� ��� ��������.

//	static void sameNames(Dog obj1, Dog obj2, Dog obj3) {
//		if (obj1.getName() == obj2.getName() && obj1.getName() != obj3.getName()) {
//			System.out.println("� ��� �� ������ � ��������� ��'��");
//			System.out.println(obj1);
//			System.out.println(obj2);
//		} else if (obj2.getName() == obj3.getName() && obj2.getName() != obj1.getName()) {
//			System.out.println("� ��� �� ������ � ��������� ��'��");
//			System.out.println(obj2);
//			System.out.println(obj3);
//		} else if (obj3.getName() == obj1.getName() && obj3.getName() != obj2.getName()) {
//			System.out.println("� ��� �� ������ � ��������� ��'��");
//			System.out.println(obj3);
//			System.out.println(obj1);
//		} else {
//			System.out.println("�� ���� ������ ����� ������� �����");
//		}
//	}
	
//�� 3-�� �������	static String sameNames(Dog obj1, Dog obj2, Dog obj3) {
//		if (obj1.getName() == obj2.getName() && obj1.getName() != obj3.getName()) {
//			return "� ��� �� ������ � ��������� ��'��";
//		} else if (obj2.getName() == obj3.getName() && obj2.getName() != obj1.getName()) {
//			return "� ��� �� ������ � ��������� ��'��";
//		} else if (obj3.getName() == obj1.getName() && obj3.getName() != obj2.getName()) {
//			return "� ��� �� ������ � ��������� ��'��";
//		} else {
//			return "�� ���� ������ ����� ������� �����";
//		}
//	}
	
	@Override
	public String toString() {
		return "������ " + this.name + "; ������: " + this.breed + "; ��: " + this.age + "�.";
	}
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Dog other = (Dog) obj;
		if (age != other.age) return false;
		if (name == null) {
			if (other.name != null) return false;
		} else if (!name.contentEquals(other.name)) return false;
		return true;
	}
	
}
