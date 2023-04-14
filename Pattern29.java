//1 and 0 right triangle
package pattern;

public class Pattern29 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
		 
		 for(int j=1;j<=i;j++)
		 {
			 if(j%2==0)
			 {
				 System.out.print("0 "); 
			 }
			 else
			 {
				 System.out.print("1 ");
			 }
			 
			 
		 }
		 System.out.println();
		}

	}

}
