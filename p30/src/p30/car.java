package p30;

public class car {
		 private int num ;
		 private double gas;
		 public car () {
			 num=0;
			 gas=0.0;
			 System.out.println("已經生產了汽車");
		 }

		 public  void setcar(int n ,double g)throws CarExpcetion{
			 if (g<0)
			 {
				 CarExpcetion e=new CarExpcetion();
				 throw e;
			 }
			 num = n ;
			 gas = g ;
			 
			 System.out.println("將車號設為"+num+"汽油量設為"+gas);
			 
			 
		 }
		 public void show()
		 {
			 System.out.println("車號是"+num);
			 System.out.println("汽油量是"+gas);
		 }
}
