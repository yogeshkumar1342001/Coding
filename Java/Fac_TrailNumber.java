package Class_Training;
import java.util.*;
public class Fac_TrailNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int mul=1,c=0;
		for(int i=a;i>0;i--) {
			mul=mul*i;
		}
		System.out.println(mul);
		//counting 0
		while(mul%10==0)
		{
			mul/=10;
			c++;
		}
		System.out.print(c);

	}

}
