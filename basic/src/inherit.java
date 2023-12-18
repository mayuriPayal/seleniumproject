

class arra
{
int a=100;
	
	void display()
	{
		System.out.println(a);
	}	
	
}

 class b extends arra
 {
	 int b=500;
		
		void show()
		{
			System.out.println("cho");
			System.out.println(b);

		} 
 }

 class c extends b
 {
	 int c=200;
		
		void shwbiz()
		{
			System.out.println(c);
			//super.show();
			
		} 
 }
 
 
 

public class inherit extends c{

	int d=50;
	
	void shwbiz()
	{
		System.out.println("cho");
		super.shwbiz();
		
	}
	
	
	
	public static void main(String[] args)
	
	{
		c obj =new c ();
	/*	obj.a=600;
        obj.show();
		obj.display();*/
		
		obj.shwbiz();
		obj.display();
		obj.show();
	
		inherit obj3=new inherit ();
		obj3.shwbiz();
		
	
	}

}

