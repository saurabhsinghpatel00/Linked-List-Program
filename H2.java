// 1234

public class H2
{
	public static void rev(int x)
	{

		int m=0;

		while(x>0)
		{
			m=(m*10)+x%10;
			x=x/10;
		}
		System.out.print(m);

	}

	public static void main(String args[])
	{
		int n=12345;

		
		rev(n);


	}

	
}