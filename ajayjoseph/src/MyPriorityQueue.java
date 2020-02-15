import java.util.LinkedList;

public class MyPriorityQueue<B extends Comparable<B>> {

	private LinkedList<B> linkedList;

	public MyPriorityQueue() 
	{

		linkedList = new LinkedList<>();

	}

	public B deleteMin()	//	returns the min value being deleted, similar to poll() method
	{

		if(linkedList.size() == 0) 
		{

			return null;

		} 
		else
		{

			
			//start from zero, iterate through the entire list to find the minimum value
			int minimum = 0;

			for(int i=0; i<linkedList.size(); i++) 
			{

				

				if(linkedList.get(minimum).compareTo(linkedList.get(i)) > 0) //	if current index value is smaller than min index, change min
				{

					minimum = i;

				}

			}

			B data = linkedList.get(minimum);	// data to return

			// remove element

			linkedList.remove(minimum);

			return data;

		}

	}

	//	Here we are not adding according to priority since our remove method gives the min , i.e highest priority element 
	public void add(B data)
	{
		

		if(data == null) 
		{

			return;

		}

		linkedList.add(data);
//		System.out.println("ll  = " + linkedList.toString());

	}

	public int size() 
	{

		return linkedList.size();

	}
}
