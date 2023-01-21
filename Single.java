class Single
{	
	public static void main(String args[])
	{

		int a[]={1,2,1,2,0,0,1,0,2,0,1,0,2,0,1};

		int l=0; 
		int m=0;
		int h=a.length-1;

		for(int i=0; i<a.length-1; i++)
		{
			if(a[m]==0)
			{
				// a[l]=0;

				int t=a[l];
				a[l]=a[m];
				a[m]=t;

				l++;
				m++;
			}

			else if(a[m]==1)
			{
				m++;
			}


			else if(a[m]==2)
			{
				int t=a[m];
				a[m]=a[h];
				a[h]=t;

				h--;

			}
		}

		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

