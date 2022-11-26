package Class_Training;
import java.util.*;
public class Sort_and_element_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int i;
		for( i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[k-1]);

	}

}
