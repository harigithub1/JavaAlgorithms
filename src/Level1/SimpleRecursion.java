package Level1;

public class SimpleRecursion {

public void print1(int n) {
	
	System.out.println(n);
	n=n+1;
	if(n<=3)
	print1(n);
}
	
	public static void main(String[] args) {
SimpleRecursion obj = new SimpleRecursion();
		obj.print1(1);

	}

}
