//triangle 123 to 15
package pattern;

public class Pattern26 {

	public static void main(String[] args) {
		int n=5,number=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
			System.out.print(" ");	
			}
			for(int j=1;j<=i;j++)
			{	
			System.out.print(number++ +" ");
			//number++;
				}
			
			
			System.out.println();
		}

	}
}
