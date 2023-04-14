package pattern;

public class Pattern11 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
		}
		for(int j=1;j<(i*2);j++)
		{

			if(j>1 && j<(i*2)-1)
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


