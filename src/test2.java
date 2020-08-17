
public class test2 {

public void print1(int n) {
	
	System.out.println(n);
	n=n+1;
	if(n<=3)
	print1(n);
}
	
	public static void main(String[] args) {
test2 obj = new test2();
		obj.print1(1);

	}

}
