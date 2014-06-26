
public class PersistentNumber
{
	//Persistent number : given a number x p(x) is product of digits of x
	
	//we form sequence x, p(X), p(p(x))
// persistence is the 0 based index of first single digit number in the sequence
	//single digit means x%10 will be x
	/**
	 * @param args
	 */
//	public static void main(String[] args)
//	{
//		// TODO Auto-generated method stub
//		
//		System.out.println(getPersistence(2128493222));//should be 2
//
//	}
	
	public static int getPersistence(int x)
	{
		int temp,digit,product=1,count=0,result = x;
		if(x<10)
			return 0;
		
		while(result>10)
		{
			temp = result;
			product = 1;
			while(temp>0) //calculates product of all digits of the number temp
			{
				digit = temp%10;
				product = product*digit;
				temp = temp/10;
			}
			//System.out.println(product);
			count++;
			result = product; //keep calculating p(x) until single digit
			
		}
		if(result == 10)
			return (count+1);
		
		
		return count;
	
		
	}

}
