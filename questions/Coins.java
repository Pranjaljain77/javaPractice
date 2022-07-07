package questions;
import java.util.*;
public class Coins {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int no=sc.nextInt();
		
		for(int m:arr)
		{
			System.out.println(m);
		}
		System.out.println(no);

	}

}
