import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testtt {
public static void main(String args[]) throws IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String str = br.readLine();
	int marks1 = Integer.parseInt(br.readLine());
	int marks2 = Integer.parseInt(br.readLine());
	int marks3 = Integer.parseInt(br.readLine());
	int total= marks1+marks2+marks3;
	float avg = total/3;
	System.out.println("Name="+str);
	System.out.println("marks1="+marks1);
	System.out.println("marks2="+marks2);
	System.out.println("marks3="+marks3);
	System.out.println("total="+total);
	System.out.println("avg="+avg);
	
	
	
}
}