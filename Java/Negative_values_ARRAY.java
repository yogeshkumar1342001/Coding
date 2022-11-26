package Library;
import java.util.*;
public class Negative_values_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=0;
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=0)
			{
				System.out.println(arr[i]);
				c++;//count
			}
			
		}

		System.out.println(c);

	}

}
