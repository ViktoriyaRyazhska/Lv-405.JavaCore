import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Task2 {

	public static void main(String[] args) {
		try {
			Map<String, String> personMap = new HashMap<>() {
				{
					put("Q", "A");
					put("W", "A");
					put("E", "D");
					put("Y", "S");
					put("T", "G");
					put("TT", "S");
					put("ASD", "F");
					put("Rt", "F");
					put("Bs", "H");
				}
			};


			for (Entry entry : personMap.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

			System.out.println("========================");


			for (Map.Entry<String, Integer> entry : searchSameName(personMap).entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

			System.out.println("========================");

			for (Entry entry : removeSameNames(personMap, "S").entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

		} catch (IllegalArgumentException | NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static Map<String, Integer> searchSameName(Map<String, String> personMap)
			throws IllegalArgumentException {
		if (personMap == null) {
			throw new IllegalArgumentException("Argument can't be null");
		}
		Map<String, Integer> sameName = new HashMap<String, Integer>();
		String temp;
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			temp = entry.getValue();
			if (sameName.containsKey(temp)) {
				sameName.put(temp, sameName.get(temp) + 1);
			} else {
				sameName.put(temp, 1);
			}
		}
		return sameName;
	}

	public static Map<String, String> removeSameNames(Map<String, String> personMap, String removableName)
			throws IllegalArgumentException {
		if (personMap == null || removableName == null) {
			throw new IllegalArgumentException("Argument can't be null");
		}
		while (personMap.values().contains(removableName)) {
			personMap.values().remove(removableName);
		}
		return personMap;
	}

}
