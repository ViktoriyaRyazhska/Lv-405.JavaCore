import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
	private String str;

	public Task5() {
	}

	public static Boolean isPalindrome(String s) {
		return s.equals((new StringBuilder(s)).reverse().toString());
	}

	@Override
	public String toString() {
		return "Task5 [str=" + str + "]";
	}
	
	public String readFromConsole () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		this.str = br.readLine(); 
		return this.str;
	}
	

}
