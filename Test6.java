class Test6
{

// fsfdsf
public String rev(String s)
{
	if(s.isEmpty())
	{
		return s;
	}
	else{
		return rev(s.substring(1))+s.charAt(0);
	}
}


	public static void main(String args[])
	{
		Test6 ob= new Test6();

		String s= "Singh";

		System.out.println(ob.rev(s));
	

	}
}