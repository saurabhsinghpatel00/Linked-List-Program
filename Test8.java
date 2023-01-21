public class Test8
{

	static void printArr(int arr[], int n)
	{
		for(int i=0; i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	static void generaterArr(int A[], int n)
	{
		int []B= new int [n];

		for(int i=0; i<n;i++)
		{
			
			int cnt=0;
			for(int j=0; j<i;j++)
			{
				if(A[j]%A[i]==0)
				{
					cnt++;
				}
			}

			B[i]=cnt;
		}

		printArr(B, n);
	}

	public static void main(String args[])
	{
		int A[]={3,5,1};
		int n=A.length;

		generaterArr(A,n);
	}
}