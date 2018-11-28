package p30;

public class ss {
	public static void main(String [] args)
	{
		car car1;
		car1 =new car();
		
		try {
			car1.setcar(1245, -10);
		 }
		catch(CarExpcetion e){
		System.out.println("©ß¥X"+e+"¤F");
			
			
		}
		car1.show();
	}
}
