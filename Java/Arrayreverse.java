package Library;
import java.util.*;
public class Arrayreverse {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int arr[]=new int[10];
		int b=arr.length;
		for(int i=0;i<a;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=a-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	

}
