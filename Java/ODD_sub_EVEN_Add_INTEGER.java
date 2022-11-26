package Library;
import java.util.*;
public class ODD_sub_EVEN_Add_INTEGER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();	
		for(int i=0;i<a.length();i++)
		{
			int t=Integer.parseInt(a.charAt(i)+"");
			if(t%2==0)
			{
				System.out.print(t+1);
				
			}
			else
				System.out.print(t-1);

		}
	}
}
