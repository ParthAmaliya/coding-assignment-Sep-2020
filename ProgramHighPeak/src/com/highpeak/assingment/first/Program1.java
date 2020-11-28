package com.highpeak.assingment.first;

import java.util.Scanner;

public class Program1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		int n, n1 = 0, n2 = 0, n3 = 0, n4 = 0;
		String name;
		
		System.out.println("Number of the employees: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			name = sc.next();
	
			switch (n) 
			{
			case 1:
				n1 = sc.nextInt();
				System.out.println(name +" : "+ n1);
				System.out.println(n1);
				break;
			
			case 2:
				n2 = sc.nextInt();
				System.out.println(name +" : "+ n2);
				break;
				
			case 3:
				n3 = sc.nextInt();
				System.out.println(name +" : "+ n3);
				break;
				
			case 4:
				n4 = sc.nextInt();
				System.out.println(name +" : "+ n4);
				break;
			}
		}
		int[] a = {n1,n2,n3,n4};
		test(a);
		
		for (int j = 0; j < a.length; j++)
		{
			System.out.println(a[j]);
		}
		System.out.println(a[0] - a[a.length-1]);
		
		sc.close();
	}
	public static void test(int[] a)
	{
		int n = a.length;
		for (int i = 0; i < n-1; i++)
		{
			for (int j = 0; j < n-i-1; j++)
			{
				if (a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
