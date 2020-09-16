//Write a java program to create three threads T1, T2 and T3 and ensure sequence T1,T2,T3 in java

public class Threads extends Thread{
	final static int MAX_NUMBERS = 3;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Threads T1 = new Threads();
		//		Threads T2 = new Threads();
		//		Threads T3 = new Threads();
		//		T1.start();
		//		T2.start();
		//		T3.start();

		Thread t1 = new Thread(new NumberRunnable(T1, 0), "T1");
		Thread t2 = new Thread(new NumberRunnable(T1, 1), "T2");
		Thread t3 = new Thread(new NumberRunnable(T1, 2), "T3");
		t1.start();
		t2.start();
		t3.start();
	}
}


class NumberRunnable implements Runnable
{
	Threads obj;
	int threadNumber;
	static int number = 0;
	NumberRunnable(Threads obj, int result)
	{
		this.obj = obj;
		this.threadNumber = result;
	}

	public void run()
	{  
		while (number < Threads.MAX_NUMBERS) {
			synchronized(obj) {	
				// check again for (number < PrintNumbers.MAX_NUMBERS) otherwise one more number my be
				// printed by another thread
				if(number % 3 == threadNumber && number < Threads.MAX_NUMBERS)
				{
					System.out.println(Thread.currentThread().getName() + " - " + ++number);
				}  
			}
		}
	}
}
