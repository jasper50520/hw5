package p21;


public class sample {
	public static void main(String [] args)
	{
		try
		{
			int []	test;
			test= new int[5];
			System.out.println("將值指定給test[10]");	
			
			test[10]=80;
			System.out.println("將80指定給test[10]");
		}

		catch( ArrayIndexOutOfboundExpception e)
		{
			
			 System.out.println("超過陣列範圍");
		}
		 System.out.println("順利執行完畢");
	}
	
}