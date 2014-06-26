package srm_622_round1_div2;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciDiv2
{

//	You're given an int N. You want to change N into a Fibonacci number. This change will consist of zero or more steps. In each step, you can either increment or decrement the number you currently have. That is, in each step you can change your current number X either to X+1 or to X-1. 
//
//
//
//	Return the smallest number of steps needed to change N into a Fibonacci number.
//	 
//	Definition
//	    	
//	Class:	FibonacciDiv2
//	Method:	find
//	Parameters:	int
//	Returns:	int
//	Method signature:	int find(int N)
//	(be sure your method is public)
	static int[] fib;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		find(1000000);

	}
	
//	public static int fibbo()
//	{
//		fib = new int[100000];
//		fib[0] = 0;
//		fib[1] = 1;
//		for(int i = 2; i<100000;i++)
//		{
//			fib[i] = fib[i-1]+ fib[i-2];
//		}
//		return 0;
//	}
//	
	public static int findTest(int N)
	{
		//works for smaller numbers
		fib = new int[N];
		int[] dif = new int[N];
		
		fib[0] = 0;
		dif[0] = N;
		fib[1] = 1;
		dif[1] = N - 1;
		for(int i = 2; i<N;i++)
		{
			fib[i] = fib[i-1]+ fib[i-2];
			dif[i] = Math.abs(N - fib[i]);
		}
		
		Arrays.sort(dif);
		System.out.println(dif[0]);
		
		return dif[0];
	}

	public static int find(int N)
	{
		int a = 0, b = 1, result = 2000000;
		int c;
		while(a<=2000000)
		{
			result = min(result, Math.abs(a - N));
			c = a+b;
			a = b;
			b = c;
			
		}
		System.out.println(result);
		return result;
	}

	private static int min(int result, int abs)
	{
		// TODO Auto-generated method stub
		if(result<abs)
			return result;
		else
			return abs;
	}
}
