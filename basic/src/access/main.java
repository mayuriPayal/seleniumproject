package access;

import java.util.Scanner;

class algebra{
	
	void add(int a, int b)
	{
		int ans=a+b;
		System.out.println("ans"+ans);
	}

	public static void main(String[] args) 
 {
		algebra obj=new algebra();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.add(a,b);
		
	}

}
