package Java;
import java.util.*;
public class String_TABLE_only {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				System.out.print(s.charAt(i));
			}
		}

	}

}
//Ip  T134AB45L570E
//OP TABLE
