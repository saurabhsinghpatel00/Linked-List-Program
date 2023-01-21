public class Example
{
	public <E> void printArray(E []s)
	{
		for(E x:s)
		{ 
			System.out.println(x);
		}

	}
	                                                                                                                                                                                                                 

	public static void main(String args[])
	{
		Example Obj= new Example();
		String countries[]= new String[]{"India", "Pakistan", "Nepal"};
		Integer numbers[]= {12,23,34,45,56};
		Obj.printArray(countries);
		Obj.printArray(numbers);
	}
 
}