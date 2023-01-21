import java.util.*;

public class Program
{
    public static void main(String args[])
    {
        String s= "Skjkjflkd";

Map<Character, Integer> mp= new HashMap<Character, Integer>();



for(int i=0; i<s.length();i++ )
{

int n=0;

        for(int j=0; j<s.length();j++)
        {

            if(s.charAt(i)==s.charAt(j))
            {
               n++;
            }

            mp.put(s.charAt(i), n);
    }

}

System.out.print(mp);




    }
}