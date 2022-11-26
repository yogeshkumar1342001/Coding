package Java;
import java.util.*;
public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			System.out.print("*"+" ");
			System.out.println();

		}
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			System.out.print("*"+" ");
			System.out.println();

		}
		int mw=sc.nextInt();
		for(int i=0;i<mw;i++)
		{
			System.out.print("*"+" ");
			System.out.println();

		}
		int w=sc.nextInt();
		for(int i=0;i<w;i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print("*"+" ");	
			}
			System.out.println();

		}*/
		int n=sc.nextInt();
		for(int i=1;i<=n*2-1;i++)
        {
              if(i!=n)
     for(int j=1;j<=n;j++)
         
                 {      if(j==n)
                        System.out.print("*");
                         System.out.print(" ");
                          
	 
             	
                    }
	else
	  for(int j=1;j<=n*2-1;j++)
         
                 {
                      
             	
                        System.out.print("*");

                 }
	 

System.out.println();
		}	
	}

}
