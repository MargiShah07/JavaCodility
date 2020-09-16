import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
////import java.util.Map;
//import java.util.TreeMap;
//
public class StudentInfoWithAward {
	//
	public static void main(String[] args) {
		TreeMap<Integer, List<String>> Student = new TreeMap<Integer, List<String>>(); 
		List<String> student1 = new ArrayList<String>(); 
		List<String> student2 = new ArrayList<String>(); 
		List<String> student3 = new ArrayList<String>(); 
		List<String> student4 = new ArrayList<String>();
		List<String> student5 = new ArrayList<String>();
		List<String> eachValue = new ArrayList<String>(); 
		String name = ""; 
		int Marks = 0; 
		int total = 0; 
		student1.add("XYZ"); 
		student1.add("80"); 
		student1.add("1");  

		student2.add("ABC"); 
		student2.add("90"); 
		student2.add("2"); 

		student3.add("MNO"); 
		student3.add("60"); 
		student3.add("3"); 

		student4.add("PQR"); 
		student4.add("85"); 
		student4.add("4");

		student5.add("UVW"); 
		student5.add("70"); 
		student5.add("5");


		Student.put(1, student1); 
		Student.put(2, student2); 
		Student.put(3, student3);
		Student.put(4, student4);
		Student.put(5, student5);
		System.out.println(Student); 
		for(Map.Entry m : Student.entrySet()) 
		{ 
			eachValue = (List<String>) m.getValue(); 
			total = Integer.parseInt(eachValue.get(1)) ; 
			//System.out.println(total); 
			if(total > Marks) 
			{ 
				Marks = total; 
				name = eachValue.get(0); 
			} 
		} 
		System.out.println("The Name of The Student is : "+name+" and Highest Mark Is : "+Marks); 

		for(Map.Entry m : Student.entrySet())
		{
			eachValue = (List<String>) m.getValue();
			total = Integer.parseInt(eachValue.get(1));
			int temp=0;
			if(total>= Marks)
			{
				name = eachValue.get(0);
				System.out.println(name + " has 1st rank with " + Marks + " Marks.");
			}
			
		}
	}
}
