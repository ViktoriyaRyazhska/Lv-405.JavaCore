import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public static void printStudent(List<Student> students, int course) {

		Iterator<Student> iter = students.iterator();
		Student student;
		while (iter.hasNext()) {
			student = iter.next();
			if (student.getCourse() == course)
				System.out.println(student.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]" + "\n";
	}
		
}
