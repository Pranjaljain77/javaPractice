package stack;

//import java.util.Arrays;

//import java.util.*;
public class StackImpl {

	private int top;
	private int arr[];
	private int capacity;
	
	StackImpl(int size)
	{
		arr= new int[size];
		capacity=size;
		top=-1;
		
	}
	
	public static void main(String[] args)
	{
//		Stack<Integer> st=new Stack<>();
//		
//		st.add(4);
//		st.add(6);
//		
//		System.out.println(st.pop());
//		System.out.println(st.pop());
		
		StackImpl st= new StackImpl(5);
		
		st.push(4);
		st.push(6);
		st.push(7);
		
		System.out.println(st.pop());
		System.out.println(st.pop());

//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		
		System.out.print("Peek value="+st.peek());
		
			
	}
	
	int peek() 
	{
		if(top!=-1)
		{
			return arr[top];
		}
		else
		{
			System.out.println("Stack is empty");
			System.exit(1);
		}
		return 0;
		
	}
	
	void push(int no)
	{
		if(isempty())
		arr[++top]=no;
		else
		{
			System.out.println("overflow and terminated");	
			System.exit(1);
		}	
	}
	int pop()
	{
		if(!isfull() &&top!=-1)
		{
			int temp=arr[top];
			arr[top]=0;
			top--;
			
			return temp;
		}
		else {
			System.out.println("underflow and terminated");
			System.exit(1);
		}
		return 0;
		
	}
	boolean isempty()
	{
		if(top<capacity-1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	boolean isfull()
	{
		if(top==capacity-1)
		{
			return true;		
		}
		else
		{
			return false;
		}
	}

}
