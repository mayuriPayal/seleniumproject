import java.util.Arrays;

public class arrayexm {

	public static void main(String[] args) {
/*int a[]=new int[5];
a[0]=100;
a[1]=200;
a[2]=300;
a[3]=400;
a[4]=400;*/
		//int a[]= {100,200,300,400,500};

//System.out.println(a[1]);
	//	System.out.println(a.length);
	//	System.out.println(Arrays.toString(a));
	/*	for(int i=0;i<a[2];i++)
		{
				System.out.println(a[i]);
		}*/
		/*for(int x:a)
		{
			System.out.println(x);
		}*/
		
		/*int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		System.out.println(a[2][0]);*/
		
	/*	int a[][]= { {100,200},
				
				{ 300,400},
				{500,600}};
		
		System.out.println(a[1][1]);
		
		System.out.println(a.length);
		System.out.println(a[0].length);*/
	//Object a[]=new Object[5];
	Object a[]= {100,20.4,'A',"Aman",500};
	System.out.println(a.length);
	System.out.println(a[3]);
	for(Object x:a)
	{
		System.out.println(x);
	}
	
	}
	
	
}
