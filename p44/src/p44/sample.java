package p44;

public class sample {

	public static void main(String [] args)
	{
		car car1 = new car("�@����");
		car1.start();
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
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
