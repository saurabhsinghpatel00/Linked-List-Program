public class Hello{
public static void main(String args[])
{
	int ar[]={1,0,2,3,1,0,1};
	int ar2[]={1,0,2,3,1,0,1};
	int c=0;
	for(int i=0; i<ar.length;i++)
	{
		if(ar[i]!=0)
		{
			ar2[i]=ar[i];
			c++;
		}
	}
	System.out.print(c);
	System.out.print(ar2[0]);
}
}