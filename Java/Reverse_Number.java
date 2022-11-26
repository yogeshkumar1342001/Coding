package Library;
import java.util.*;
public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int sum=0,rem;
		while(a!=0)
		{
			rem=a%10;
			sum=sum*10+rem;
			a=a/10;
		}
		System.out.println(sum);

	}

}
