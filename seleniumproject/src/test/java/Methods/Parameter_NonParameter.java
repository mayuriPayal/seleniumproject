package Methods;

public class Parameter_NonParameter {
	
	int x=10;
	int y=20;
	String name;
	int b;
	double a;
	
	void m1()
	{
		System.out.println("m1");
	}
	
	void m2(int x)
	{
		this.x=x;
		System.out.println(x);
	}

	void m3(double a)
	{
		this.a=a;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		Parameter_NonParameter obj=new Parameter_NonParameter();
		obj.m1();
		obj.m2(23);
		obj.m3(23);

	}

}
