import java.util.concurrent.*;
import java.util.stream.*;
import java.util.*;

public class Has
{
    public static void main(String args[])
    {

        List<Integer>l= Arrays.asList(1,2,3,4,5,6,7,8,9);
        // l= l.parallelStream().map(x->x).collect(Collectors.toList());
        l.parallelStream().forEach(x->System.out.print(x));
        // System.out.println(l);
    }
}