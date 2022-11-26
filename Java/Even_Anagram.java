package Library;
import java.util.*;
public class Even_Anagram {
    //if the string anagram-length and it is even or odd
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		a=a.toUpperCase();
		b=b.toUpperCase();
		if(a.length()==b.length())
		{
			char c[]=a.toCharArray();
			char d[]=b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			if(Arrays.equals(c, d))	
			{
				System.out.println("Anagram");
				if(b.length()%2==0)
				{
					System.out.println("Even");
				}
				else
					System.out.println("Odd");
			}
		}
		else
		{
			System.out.println("Not Anagram");
		}

	}

}
