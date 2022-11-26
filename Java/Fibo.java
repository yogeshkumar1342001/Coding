package Library;
import java.util.*;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();

		int t=0;
		
		if(a<2)
		{
			System.out.println(a);
		}
		else {
			System.out.print(0+" ");
			System.out.print(1+" ");
			long b[] = new long[a+1];
			b[0]=0;b[1]=1;
		for(int i=2;i<=a;i++)
		{
			b[i]=b[i-1]+b[i-2];
			System.out.print(b[i]+" ");
		}
		//System.out.print(b[a]);--value
		
		}

	}

}
