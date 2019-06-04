import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		try {
			Integer[] arr1 = { 1, 2, 3, 4, 35, 6, 23, 78, 16, 65, 34 };
			Integer[] arr2 = { 1, 2, 4, 6, 78, 23, 84, 324, 457 };
			Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
			Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

			System.out.println("First set of values: " + set1);
			System.out.println("Secondset of values: " + set2);
			System.out.println("Union elements: " + union(set1, set2));
			System.out.println("Intersect elements: " + intersect(set1, set2));
		} catch (IllegalArgumentException | NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static Set union(Set set1, Set set2) throws IllegalArgumentException {
		if (set1 == null || set2 == null) {
			throw new IllegalArgumentException("Argument can't be null");
		}
		Set result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

	public static Set intersect(Set set1, Set set2) throws IllegalArgumentException {
		if (set1 == null || set2 == null) {
			throw new IllegalArgumentException("Argument can't be null");
		}
		Set result = new HashSet<>(set1);
		result.retainAll(set2);
		return result;
	}

}
