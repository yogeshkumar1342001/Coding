package Class_Training;
import java.util.*;
public class twod_Array_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int k;
		int arr[][]=new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<a;i++) {
			 k=arr[i][0];
			for(int j=0;j<b;j++) {
				if(arr[i][j]>k)
				k=arr[i][j];
			}
		
		System.out.println(k);
		}		

	}

}
