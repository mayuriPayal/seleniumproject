
public class construction {

	 

		int a;
		String name;
		construction(int a,String name)
		{
			this.a=a;
			this.name=name;
		}
		
	void show()
	{
		System.out.println(a);
		System.out.println(name);

	}
	public static void main(String[] args) {
		construction obj=new construction(10,"john");
		obj.show();
		
		
		
	}
}
		