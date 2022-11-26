package Library;
import java.util.*;
public class NonRep_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=0;
		for(int i=a;i<=b;i++)
		{
			if(isnon(i))
			{
				c++;
			}
		}
		System.out.print(c);
	}
	public static boolean isnon(int i)
	{
		String s=i+"";
		for(int j=0;j<s.length();j++)
		{
			for(int k=0;k<s.length();k++)
			{
				if(s.charAt(j)==s.charAt(k) && j!=k)
					return false;
			}
		}
		return true;
	}

	

}
