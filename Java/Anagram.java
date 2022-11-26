package Library;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		a=a.toLowerCase();
		b=b.toLowerCase();
		if(a.length()==b.length())
		{
			//String to character array-toCharArray
			char c[]=a.toCharArray();
			char d[]=b.toCharArray();
			//sort used - alphabet wise
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(d));
			Arrays.sort(c);
			Arrays.sort(d);
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(d));
			boolean res=Arrays.equals(c, d);
			if(res)
			{
				System.out.print("Anagram");
			}
			else
				System.out.print("Not an Anagram");
		}
		else
			System.out.println("Not an Anagram");

	}

}
