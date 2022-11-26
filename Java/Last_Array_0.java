package Library;
import java.util.*;
public class Last_Array_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			if(arr[i]!=0)
			System.out.print((arr[i]+" "));
		}
		for(int i=0;i<a;i++)
		{
			if(arr[i]==0)
			System.out.print((arr[i]+" "));
		}
		
	}

}
