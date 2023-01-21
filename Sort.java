// [1,3,5,1,3,1,7,8]

import java.util.*;
import java.util.List;

public class Sort{

public static void main(String args[])
{

	HashMap<Integer, Integer>mp= new HashMap<Integer, Integer>();

	List<Integer>li= Arrays.asList(1,3,5,1,3,1,7,8);

int t2=0; 

for(int i=0; i<li.size(); i++)
{
	int t=0; 

	for(int j=0; j<li.size(); j++)
	{
		if(li.get(i)==li.get(j))
		{
			t2++;
		}
	}

	mp.put(li.get(i), t2);
}


HashSet<Integer>st= new HashSet<Integer>();

Entry<Set<Integer, Integer>>en= mp.entrySet();

for(Entry<Set<Integer, Integer>>en2:en)
{
   st.add(en2.getValue);
}

ArrayList<Integer> li2= Arrays.asList(st);
Collections.sort(li2);

Integer n=(li2.get(li2.size()-2));

Integer o=0;

for(Entry<Set<Integer, Integer>>en2:en)
{
   if(mp.getValue(n))
   {
   	o=(mp.getKey(n));
   	break;
   }
}






}

}