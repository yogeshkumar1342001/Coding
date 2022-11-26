package Library;
import java.util.*;
//1-0,1;0-0;5-0 1 1 2  3
public class Fibooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0,b=1;
		int d;
		int c=sc.nextInt();
		System.out.print(a+" "+b);
		
		for(int i=0;i<c;i++)
		{
			d=a+b;
			System.out.print(" "+d+" ");
			a=b;
			b=d;
		}

	}

}
