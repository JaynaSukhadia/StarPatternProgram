//A pattern
package pattern;

public class Pattern12 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
		}
		for(int j=1;j<(i*2);j++)
		{

			if(j>1 && j<(i*2)-1)
			//if(i==1||j==1 ||j(i*2)-1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
	}
}
