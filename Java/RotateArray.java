package Library;
import java.util.*;
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=scan.nextInt();
		}
		int r=scan.nextInt();
		for(int i=0;i<r;i++)
		{
			int t=arr[a-1];
			for(int j=a-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=t;
		}
		System.out.print(Arrays.toString(arr));
	}

}
