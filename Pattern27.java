//reverse right angle triangle number
package pattern;

public class Pattern27 {

	public static void main(String[] args) {
		int n=5,number;
		for(int i=1;i<=n;i++)
		{
			number=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}

}
