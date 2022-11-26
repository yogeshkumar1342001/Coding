package Java;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,t=n;
		while(n!=0) {
			int rem=n%10;  //12%10-->2
			sum=sum*10+rem;
			n=n/10; //12/10-->1.2-->1
		}
		if(t==sum) {
			System.out.println("Palindrome"+" " +sum);
		}
		else
			System.out.println("Not a palindrome "+sum);

	}

}
