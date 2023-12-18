package Static_Methods;

public class Static_Main {
	
	public static void main(String[] args) 
	
	
	{
		
		Static1 obj=new Static1();
		//non static
		System.out.println(obj.x);
		obj.m1();
		
		//static
		
		System.out.println(Static1.y);
		Static1.m2();
		obj.m2();
	}


}
