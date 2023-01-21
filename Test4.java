class Area{

int h;
int b;

Area(int h, int b)
{
	this.h=h;
	this.b=b;
}

public void getArea()
{
	int area= h*b;

	System.out.println("Area is : "+ area);
}
}

class Test4{

	public static void main(String args[])
	{
		Area a= new Area(4,6);

		a.getArea();
	}
}