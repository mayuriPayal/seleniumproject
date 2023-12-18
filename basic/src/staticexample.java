
public class staticexample {

	static int a=10;
	int b =5;
	
	
	static void m1()
	{
		System.out.println("static");
	}
	
	
	void m2()
	{
		System.out.println("non static");
	}
	
	
	void m3()
	{
		System.out.println("non non  static");
		m2();
	}

	
	
	void m()
	{
		//System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		m3();
		System.out.println(a);
		System.out.println( b);
	}

	public static void main(String[] args) {
 
	a =30;
	System.out.println(a);
	
	//	m1();
	/*	staticexample ob = new staticexample();
		ob.m();*/
		
		m1();
		

	

}
}