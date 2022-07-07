package linkedList;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}
public class LinkedListImpl 
{
		
	public static void main(String[] args)
	{
		
		Node first =new Node(1);
		Node second=new Node(2);
		Node third =new Node(3);
		Node fourth=new Node(4);
		
		Node head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}

}
