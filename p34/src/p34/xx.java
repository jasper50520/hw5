package p34;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class xx {
	public static void main(String [] args)
	
	{
		 System.out.println("請書入字串	");
		 
		 try {
			 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			 String str = br.readLine();
			 System.out.println("已輸入字串"+str);
			 
		 }

		 catch(IOException e)
		 {
			 System.out.println("輸入有錯誤");
		 }
		
	}
	
}
