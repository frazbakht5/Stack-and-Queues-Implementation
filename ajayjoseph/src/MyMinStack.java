import java.util.Stack;

public class MyMinStack<B extends Comparable<B>> 
{

	private Stack<B> s1;
	private Stack<B> s2;

	public MyMinStack()
	{
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	public void push(B x)
	{
		s1.push(x);
		if (s2.isEmpty())
		{
			s2.push(x);
		}
		else
		{
			//	push the Math.min(s2.peek(), x)
			if (x.compareTo(s2.peek()) == 0 || x.compareTo(s2.peek()) == -1)
			{
				s2.push(x);
			}

			else
			{
				s2.push(s2.peek());
			}
		}

	}
	public void pop()
	{
		s1.pop();
		s2.pop();
	}
	public int size()
	{
		return s1.size();
	}
	public B min()
	{
		return s2.peek();
	}
}
