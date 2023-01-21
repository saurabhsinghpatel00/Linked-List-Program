class Increment
{
	public static void main(String args[])
	{
		int i=-5;
		int j=-1;
		int k=-3;
		 int s1=0, s2=0;



		while(i!=j)
		{
			s1=s1+i;			
			i++;
			
		}

		while(j!=(k-1))
		{
			s2=s2+j;			
			j--;
			
		}

		System.out.println(s1+s2);
	}
}

