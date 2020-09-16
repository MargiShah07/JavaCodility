import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

//Write a java program to store 5 unique elements in sorted order. Error should exist if user tries to add duplicates.

public class StoreUniqueElements {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements: ");
		TreeSet<Integer> TS=new TreeSet<Integer>();
		int i1 = s.nextInt();
		int i2 = s.nextInt();
		int i3 = s.nextInt();
		int i4 = s.nextInt();
		
		TS.add(i1);
		TS.add(i2);
		TS.add(i3);
		TS.add(i4);
		
		System.out.println("Treeset is :" + TS);	
	}
}