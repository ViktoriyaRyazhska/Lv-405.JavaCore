import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		try {
			students.add(new Student("Q", 1));
			students.add(new Student("W", 2));
			students.add(new Student("E", 1));
			students.add(new Student("R", 2));
			students.add(new Student("T", 4));

			Student.printStudent(students, 2);
			System.out.println("Students ordered by name");
			students.sort(new SortByNameStudent());
			System.out.println(students);
			System.out.println("===================================");
			System.out.println("Students ordered by course");
			students.sort(new SortByCourse());
			System.out.println(students);
			System.out.println("===================================");
		} catch (IllegalArgumentException | NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
