import java.util.Queue;
import java.util.Stack;

public class queue<T> {
	

	// Implement Queue using two stacks
	
		private Stack<T> s1, s2;

		// Constructor
		queue() 
		{
			s1 = new Stack<>();
			s2 = new Stack<>();
		}

		// Enqueue an item to the queue
		public void enqueue(T data)
		{
			// Push item into the first stack
			s1.push(data);
		}

		// Dequeue an item from the queue
		public T dequeue()
		{
			// if both stacks are empty
			if (s1.isEmpty() && s2.isEmpty()) 
			{
				System.out.println("Underflow!!");
				System.exit(0);
			}

			// if second stack is empty, move elements from first stack to it
			if (s2.isEmpty())
			{
				while (!s1.isEmpty())
				{
					s2.push(s1.pop());
				}
			}

			// return the top item from the second stack
			return s2.pop();
		}

		public static void main(String[] args) {
			int[] keys = { 1, 2, 3, 4, 5 };
			Queue q = new Queue();

			// insert above keys
			for (int key : keys) {
				q.enqueue(key);
			}

			System.out.println(q.dequeue());	// print 1
			System.out.println(q.dequeue());	// print 2
		}
	}
	


