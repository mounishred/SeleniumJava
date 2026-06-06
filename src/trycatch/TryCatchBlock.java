package trycatch;

public class TryCatchBlock {

	public static void main(String[] args) {
		//int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		//System.out.println(num[8]);
		
		try
		{
			int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
			System.out.println(num[4]);
		}
		
		catch(Exception e)
		{
			System.out.println("Your'e accessing wrong index no");
			System.out.println("==== Error due to exception is:"+e);
		}
		

	}

}
