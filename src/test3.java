import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {
public static void main(String args[]) throws IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String str = br.readLine();
int marks = new int[2];
	for(int i=0;i<3;i++) {
	int marks[i] = Integer.parseInt(br.readLine());
	}
	
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
