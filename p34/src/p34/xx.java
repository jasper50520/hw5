package p34;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class xx {
	public static void main(String [] args)
	
	{
		 System.out.println("�ЮѤJ�r��	");
		 
		 try {
			 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			 String str = br.readLine();
			 System.out.println("�w��J�r��"+str);
			 
		 }

		 catch(IOException e)
		 {
			 System.out.println("��J�����~");
		 }
		
	}
	
}
