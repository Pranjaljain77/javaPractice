package queue;

public class QueueImpl {

	private int arr[];
	private int capacity;
	private int front;
	private int rear;
	private int count;
	private int co;
	
	QueueImpl(int size)
	{
		arr =new int[size];
		capacity=size;
		front=0;
		rear=-1;
		count=0;
	}
	
	public static void main(String[] args) 
	{
		QueueImpl qu=new QueueImpl(5);
		
		qu.enque(4);
		qu.enque(6);
		qu.enque(7);
		qu.enque(8);
		qu.enque(9);
//		qu.enque(10);
		System.out.println(qu.deque());
		System.out.println(qu.deque());
		System.out.println(qu.deque());
		
//		System.out.println(qu.size());
//		System.out.println(qu.peek());
		
		System.out.println(qu.deque());
		System.out.println(qu.deque());
		System.out.println(qu.deque());




	}
	
	void enque(int no) 
	{
		if(isempty())
		{
		arr[++rear]=no;
		count++;
		co++;
		}
		else
		{
			System.out.println("overflow");
			System.exit(1);
		}
	}
	int deque()
	{
		if(isempty() && co==0)
		{
			System.out.println("Underflow");
			System.exit(1);
		}
		else
		{
			int temp= arr[front];
			arr[front]=0;
			front++;
			co--;
			return temp;
		}
		return 0;
		
		
	}
	boolean isempty() 
	{
		if(count<capacity ||co==0)
		{
			return true;
		}
		
		return false;
		
	}
	boolean isfull() 
	{
		if(count==capacity )
		{
			return true;
		}
		
		return false;
		
	}
	int peek() 
	{	
		return arr[front];
		
	}
	int size() 
	{
		return co;
	}

}
