import java.util.*;

public class Sort2
{
	public static void main(String args[])
	{
		String s="zzzzzzzbbbbbttteeeqqa";
		String ar[]=s.split("");

		HashSet<String>st= new HashSet<String>();
		for(int i= 0; i<ar.length; i++)
		{
			st.add(ar[i]);
		}

		

		List<String> lis = new ArrayList<String>();
        for (String x : st)
        {
            lis.add(x);
        }


		ArrayList<Integer>li= new ArrayList<Integer>();

		String s2="";

		for(int i=0; i<lis.size(); i++)
		{
			Integer t=0;
			

			for(int j=0; j<ar.length; j++)
			{
				
				if(lis.get(i).equals(ar[j]))
				{
					t++;
				}
				
			}
			li.add(t);
			s2=s2+lis.get(i)+t;
		}

		HashSet<Integer>st2= new HashSet<Integer>();
		for(int i= 0; i<li.size(); i++)
		{
			st2.add(li.get(i));
		}


		List<Integer> lis2 = new ArrayList<Integer>();
        for (Integer x : st2)
        {
            lis2.add(x);
        }

		Collections.sort(lis2);
		Collections.reverse(lis2);



		String sf="";
		for(int i=0; i<lis2.size(); i++)
		{
			for(int j=0; j<s2.length(); j++)
			{
				if((s2.charAt(j)-'0')==lis2.get(i))
				{
					for(int k=0; k<lis2.get(i); k++)
					{
						sf=sf+s2.charAt(j-1);
					}
				}
			}
		}

		System.out.println(sf);
		// System.out.println(lis);
		// System.out.println(lis2);

	}
}