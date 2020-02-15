import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue
{
	private Queue<Integer> primaryQueue = new LinkedList<Integer>();
	private Queue<Integer> secondaryQueue = new LinkedList<Integer>(); 

	public StackUsingQueue()
	{
		Queue<Integer> primaryQueue = new LinkedList<Integer>();
		Queue<Integer> secondaryQueue = new LinkedList<Integer>();
	}

	public void push(int data)
	{


		if(primaryQueue.size() == 0 || primaryQueue.peek() == null)
		{
			//			System.out.println("Adding " + data + " in PQ");
			primaryQueue.add(data);
		} 
		else
		{
			for (int i = primaryQueue.size(); i > 0; i--)
			{
				int temp = primaryQueue.remove();
				//				System.out.println("Adding " + temp + " in SQ");
				secondaryQueue.add(temp);
			}

			primaryQueue.add(data);
			//			System.out.println("Adding  " + data + " in PQ");

			for (int j = secondaryQueue.size(); j > 0; j--)
			{
				int temp = secondaryQueue.remove();
				//				System.out.println("Adding " + temp + " in PQ");
				primaryQueue.add(temp);
			}
		}

	}
	public Integer pop()
	{
		if(primaryQueue.size() < 1)
		{
			System.out.println("Nothing to pop");
			return null;
		}
		else
		{

			int dataToReturn = primaryQueue.remove();

			System.out.println(dataToReturn);
			System.out.println("\nNow stack is : "+ primaryQueue + "\n");

			return dataToReturn;
		}


	}

	public void printStack()
	{
		System.out.println(primaryQueue);
	}

}
