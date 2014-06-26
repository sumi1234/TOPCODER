package SRM_625_DivII;

import java.util.Arrays;
import java.util.Random;

public class AddMultiply
{
	//	You are given an int y. We are looking for any int[] x that satisfies the following constraints:
//
//x has exactly three elements
//( x[0] * x[1] ) + x[2] = y
//Each x[i] must be between -1000 and 1000, inclusive.
//No x[i] can be equal to 0 or 1.
//Find and return one such x.
// y is between 0 and 500
	/**
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			makeExpression(5);
	}
	
	public static int[] makeExpression(int y)
	{
		Random rand = new Random();
		int expression;
		int[] arr = new int[3];
		int max, min;
		while(true)
		{
			max = 1000; min = 2;
			arr[0] = rand.nextInt((max - min) + 1) + min;
			arr[1] = rand.nextInt((max - min) + 1) + min;
			max = -1;min = -1000;
			arr[2] = rand.nextInt((max - min) + 1) + min;
			
			expression = arr[0]*arr[1] + arr[2];
			if(expression == y)
			{
				System.out.println(Arrays.toString(arr));
				return arr;
				
			}
		}
		
	}

}
