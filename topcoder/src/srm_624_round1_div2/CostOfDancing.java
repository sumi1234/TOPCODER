package srm_624_round1_div2;

import java.util.Arrays;

public class CostOfDancing
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] arr = {973, 793, 722, 573, 521, 568, 845, 674, 595, 310, 284, 794, 913, 93, 129, 758, 108, 433, 181, 163, 96, 932,
				 703, 989, 884, 420, 615, 991, 364, 657, 421, 336, 801, 142, 908, 321, 709, 752, 346, 656, 413, 629, 801};
		minimum(39, arr);
		// TODO Auto-generated method stub

	}
	
	public static int minimum(int K, int[] danceCost)
	{
		int sum = 0,i=0,j=0;
		Arrays.sort(danceCost);
		for(i=0;i<K;i++)
		{
			sum = sum + danceCost[i];
		}
		System.out.println(sum);
		return sum;
		
	}

}
