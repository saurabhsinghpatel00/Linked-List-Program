import java.util.*;
  
class Test2 {
  
    // Driver code
    public static void main(String[] args)
    {
  
        System.out.println("The stream after applying "
                           + "the function is : ");
  List number = Arrays.asList(2,3,4,5,3);
Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
         }
}