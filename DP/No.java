import java.util.*;

class No
{


	public static void main(String args[])
	{
		int n=231145;	

		// No obj= new No();


		while(n>10)
		{
			n=check(n);

		}	

		System.out.print(n);


	}


	static int check(int x)
		{
			int sum=0;
			while(x>0)
			{
				sum=sum+x%10;
				x=x/10;
			}

			return sum;
		}

   }
