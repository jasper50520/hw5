package p47;


public class ss {
	public static void main(String [] args) throws InterruptedException
	{
		car car1 = new car("1����");
		car1.start();
		
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("���b�i��main()���B�z�u�@");
			}
			catch(InterruptedException e)
			{
				
			}
		
		}
	}
	
	
}
	class car  extends Thread
		{
		private String name;
		public car(String nm)
		{
			name = nm;
		}
	public void run()

	{
		for(int i=0;i<5;i++)
		{
			
				System.out.println("���b�i��"+name+"���B�z�u�@");
		 
		
	}
  }
}
