package Class_Training;
import java.util.*;
public class Except_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.replaceAll("[aeiouAEIOU]","");
		//String s1=s.replaceAll("[^aeiouAEIOU]",""); ---> Vowels print
		System.out.println(s1);
		

	}

}
