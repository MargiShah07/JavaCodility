import java.util.Arrays;

//Write a java program to implement your own ArrayList which has two methods a) add b) remove and store 5 student information in your ArrayList.
public class OwnArrayList {

	private Object[] Students;
	private int actSize = 0;

	public OwnArrayList(){
		Students = new Object[10];
	}
	public void add(Object obj){
		if(Students.length-actSize <= 5){
			increaseListSize();
		}
		Students[actSize++] = obj;
	}
	private void increaseListSize(){
		Students = Arrays.copyOf(Students, Students.length*2);
		System.out.println("\nNew length: "+Students.length);
	}
	public Object remove(int index){
		if(index < actSize){
			Object obj = Students[index];
			Students[index] = null;
			int tmp = index;
			while(tmp < actSize){
				Students[tmp] = Students[tmp+1];
				Students[tmp+1] = null;
				tmp++;
			}
			actSize--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	public Object get(int index){
		if(index < actSize){
			return Students[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public int size(){
		return actSize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OwnArrayList OwnArr = new OwnArrayList();
		OwnArr.add(new String("ABC"));
		OwnArr.add(new String("MNC"));
		OwnArr.add(new String("PQR"));
		OwnArr.add(new String("TRP"));

		for(int i=0;i<OwnArr.size();i++)
		{
			System.out.print(OwnArr.get(i)+" ");
		}
		System.out.println("Removing element at index 2: "+OwnArr.remove(2));
		for(int i=0;i<OwnArr.size();i++)
		{
			System.out.print(OwnArr.get(i)+" ");
		}
	}

}
