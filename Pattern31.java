//Right Triangle alphabet pattern
package pattern;

public class Pattern31 {

	public static void main(String[] args) {
		int n=5,alpha=65;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
	}

}
