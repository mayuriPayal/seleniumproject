package access;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
//declaration
	/*	int a[]=new int [5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		//int a[]= {100,200,300,400,500,600};
		//System.out.println(Arrays.toString(a));
		//System.out.println(a.length);
		//System.out.println(a[3]);
		//using loop
		/*for(int i=0;i<6;i++)
		{
		System.out.println(a[i]);
		}*/
		//for(int x: a)
			//System.out.println(x);
			
		/*	int a[][]=new int[3][2];
		   a[0][0]=100;
		   a[0][1]=200;
		   a[1][0]=300;
		   a[1][1]=400;
		   a[2][0]=500;
		   a[2][1]=600;
		   System.out.println(Arrays.toString(a));*/
		//int a[][]= {{100,200},
				   // {300,400},
				    //	{500,600}};
		
//System.out.println(a.length);
//System.out.println(a[0].length);
/*for(int r=0;r<a.length;r++)
{
	for(int c=0;c<a[r].length;c++)
	{
		System.out.println(a[r][c]);
	}
			
}*/
		/*for(int x[]:a)
		
			for(int v:x)
			{
				System.out.println(v);
			}*/
		Object a[]=new Object[5];
		a[0]="mayuri";
		a[1]=100;
		a[2]=10.33;
		a[3]='p';
		a[4]="ashu";
		//System.out.println(Arrays.toString(a));
		for(Object x:a)
		{
			System.out.println(x);
		}
	}
}


