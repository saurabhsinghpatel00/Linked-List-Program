import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Parent
{
    public int startElement=1;
    
    public int endElement=150;
    
    public String filter()
    {
        return null;
    }
}

class ChildOne extends Parent
{
     public String filter(int x, int y)
   {     
    

     int lower = x, upper = y;
     String str="";

     for (int i = lower; i <= upper; i++)
       {
       if (isPrime (i))
       {
        str=str+Integer.toString(i)+" ";
       }
       }
    return str;
       
   }

   static boolean isPrime (int n)
   {
    
    if (n < 2)
       return false;
     for (int i = 2; i < n / 2; i++)
       {
      if (n % i == 0)
        return false;
       }

     // if reached here then must be true
     return true;
   }
         
   
       
}

class ChildTwo extends Parent
{
    
       public static int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
          
        //Calculates the sum of squares of digits  
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    }  
    
    
    public String filter(int x, int y)
    {
            String str="";
        
        for(int i = x; i <= y; i++){  
            int result = i;  
              
            
            while(result != 1 && result != 4){  
                result = isHappyNumber(result);  
            }  
              
            if(result == 1)  
                str=str+Integer.toString(i)+" ";  
        }  
        
        return str;
    }  
        
        
        
    
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc= new Scanner(System.in);
        int start= sc.nextInt();
        int end= sc.nextInt();
        
        if(start==0)
        {
            start=1;
        }
        ChildOne obj1= new ChildOne();
        System.out.println(obj1.filter(start, end));
        
        ChildTwo obj2= new ChildTwo();
        System.out.println(obj2.filter(start, end));
        
        
        
        
        
    }
}