package queue;

public class CircularQueue {

	private int arr[];
	private int capacity;
	private int front;
	private int rear;
	private int count;
	
	CircularQueue(int size)
	{
		arr =new int[size];
		capacity=size;
		front=-1;
		rear=-1;
		count=0;
	}
	
	public static void main(String[] args) 
	{
		CircularQueue cq=new CircularQueue(5);
		
		cq.cenque(1);
		cq.cenque(2);
		cq.cenque(3);
		
		System.out.println(cq.cdeque());
		System.out.println(cq.cdeque());
		System.out.println(cq.cdeque());
		cq.cenque(8);
		//cq.cenque(6);
//		System.out.println(cq.cdeque());
//		
		cq.cenque(4);
		cq.cenque(5);
		cq.insertfront(9);
//		cq.cenque(6);
////		
		System.out.println(cq.size());
//		System.out.println(cq.cdeque());
//		System.out.println(cq.cdeque());
//		cq.cenque(9);
		System.out.println(cq.peek2());
		System.out.println(cq.deletelast());
		System.out.println(cq.peek());
		
//		System.out.println(cq.cdeque());
//		cq.cenque(8);
//		//cq.cenque(6);
//		System.out.println(cq.cdeque());
		



	}
	
	void cenque(int no) 
	{
		if(isfull())
		{
			System.out.println("overflow");
			System.exit(1);
		}
		count++;
		rear++;
		if(rear==capacity)
		{
			rear=(rear)%capacity;
			arr[rear]=no;
		}
		else
		arr[rear]=no;
		
		
		
	}
	int cdeque()
	{
		if(isempty())
		{
			System.out.println("underflow");
			System.exit(1);
		}
		count--;
		front++;
		if(front==capacity)
		{
			front=(front)% capacity;
			int temp=arr[front];
			arr[front]=0;
			return temp;
		}
		
		int temp=arr[front];
		arr[front]=0;
		return temp++;
		
	}
	
	boolean isempty() 
	{
		if(count==0)
		{
			return true;
		}
		return false;
		
	}
	boolean isfull() 
	{	
		if(count==capacity)
		{
			return true;
		}
		return false;
		
	}
	int peek() 
	{
		int temp=front;
		temp++;
		if(temp==capacity)
		{
			temp=(temp)%capacity;
			return arr[temp];
		}
		return arr[temp];
		
	}
	int size() 
	{
		return count;
		
	}
	
	void insertfront(int no)
	{
		if(isfull())
		{
			System.out.println("overflow");
			System.exit(1);
		}
		count++;
		front--;
		if(front==-1)
		{
			front=capacity-1;
			arr[front]=no;
		}
		else
		arr[front]=no;
		
		
	}
	int deletelast() 
	{
		if(isempty())
		{
			System.out.println("underflow");
			System.exit(1);
		}
		count--;
		rear++;
		if(rear==capacity)
		{
			rear=(rear)% capacity;
			int temp=arr[rear];
			arr[rear]=0;
			return temp;
		}
		
		int temp=arr[rear];
		arr[rear]=0;
		return temp++;
		
		
	}
	int peek2() 
	{
		int temp=front;
	//	temp++;
//		if(temp==capacity)
//		{
//			temp=(temp)%capacity;
//			return arr[temp];
//		}
		return arr[temp];
		
	}



}
