
import java.util.TreeMap;


public class Studentinfo {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> student = new TreeMap<String, Integer>();
		student.put("abc",1);
		student.put("xyz",2);
		student.put("pqr",3);
		student.put("mno",4);
		student.put("jkl",5);
//		student.put(key, value);
		
		System.out.println("student information: " + student);
		
		System.out.println("student registration number: " + student.values());
		
		System.out.println("student name: " + student.keySet());
		
	}
}
