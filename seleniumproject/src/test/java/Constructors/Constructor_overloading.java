package Constructors;

public class Constructor_overloading {

	int x,y;
	String name;
	Constructor_overloading (int y)
	{
		this.y=y;
	}
	
	Constructor_overloading (int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	Constructor_overloading(int x,String name)
	{
		this.x=x;
		
	}
	
	Constructor_overloading(double b, int x)
	{
		
	    y=x;
	}

	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
	

		/*Constructor_overloading obj=new Constructor_overloading(10)	;
		obj.display();*/
		Constructor_overloading obj=new Constructor_overloading(10,"mayu")	;
		obj.display();
}
}