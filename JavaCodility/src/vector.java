import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("t");
		v.add("e");
		v.add("k");
		v.add("a");
		v.add("r");
		v.add("c");
		v.add("h");
		System.out.println("Size is: "+v.size());
		System.out.println("Default capacity increment is: "+v.capacity());

		Enumeration en = v.elements();
		System.out.println("\nElements are:");
		while(en.hasMoreElements())
			System.out.print(en.nextElement() + " ");

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Nth position: ");
		int n = s.nextInt();
		System.out.println("Enter letter: ");
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();

		//		StringBuilder builder = new StringBuilder();
		for(int i = 0; i<=n ;i++)
		{
			//			System.out.println(str);
			v.add(3,str);
		}

		//		v.add(3,str);
		Enumeration e = v.elements();
		System.out.println("\nElements are:");
		while(e.hasMoreElements())
			System.out.print(e.nextElement() + " ");

		for(int i =0 ; i<=n;i++)
		{
			v.remove(6);
		}
		
		Enumeration e1 = v.elements();
		System.out.println("\nElements are:");
		while(e1.hasMoreElements())
			System.out.print(e1.nextElement() + " ");


	}

}
