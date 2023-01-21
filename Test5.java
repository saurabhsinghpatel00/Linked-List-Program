import java.util.List;
import java.util.ArrayList;

public class Test5  {

  public String count(String s1)
{
  char ch=s1.charAt(0), ch2;
  String s2="";
  s2=s2+ch;
  int c=0;

for(int i=0; i<s1.length()-1;i++)
{
   c++;
   ch=s1.charAt(i);
   ch2=s1.charAt(i+1);
if(i+1==s1.length()-1)
{
  s2=s2+(c+1);
  break;
}

else if(ch!=ch2)
{
  s2=s2+c+ch2;
  c=0;
}
}
return s2;
}

    public static void main(String args[]) {
    
    String s="aabccccaa";
    
    Test5 obj=new Test5();

    

     System.out.println(obj.count("aabccccaa"));
    }
}
