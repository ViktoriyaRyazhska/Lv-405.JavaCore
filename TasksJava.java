import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TasksJava {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int choice = Integer.parseInt(br.readLine());
				
				switch (choice) {
		        case 1:
		            break;
		        case 2:
		            break;
		        case 3:
		            break;
		        case 4:
		            break;
		        case 5:
		        	System.out.print("Enter string and check if this string is palindrome:");
		        	String str = br.readLine();;
		        	Task5 task5 = new Task5();
		        	System.out.println(task5.isPalindrome(str));
		        	break;
		        case 6:
		        	break;
		        case 7:
		        	break;
		        case 8:
		        	break;
		        case 9:
		        	break;
		        case 10:
		        	break;
		        case 11:
		        	break;
		        case 12:
		        	break;
		        case 13:
		        	break;
		        case 14:
		        	break;
		        default:
		    }
		
	}
	
	
	public static void fileWriter (Object object) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("t1.txt"));
		String str = object.toString();
		bw.write(str);
	}
	

}
