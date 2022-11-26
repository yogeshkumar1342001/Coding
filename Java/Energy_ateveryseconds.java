package Class_Training;
import java.util.*;
public class Energy_ateveryseconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initial value,Rate,Number
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		int p=1;
		System.out.println(a);
		
		for(int i=1;i<=n-1;i++)
		{
			a=a*r;
			System.out.println(a);

		}

		


	}

}
