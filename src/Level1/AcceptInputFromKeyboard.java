package Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptInputFromKeyboard {
public static void main(String args[]) throws IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String str = br.readLine();
int marks[] = new int[2];
	for(int i=0;i<3;i++) {
	marks[i] = Integer.parseInt(br.readLine());
	}
	
	int total= marks[1]+marks[2]+marks[0];
	float avg = total/3;
	System.out.println("Name="+str);
	System.out.println("marks1="+marks[0]);
	System.out.println("marks2="+marks[1]);
	System.out.println("marks3="+marks[2]);
	System.out.println("total="+total);
	System.out.println("avg="+avg);
	
	
	
}
}
