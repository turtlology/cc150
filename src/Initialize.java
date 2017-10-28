
public class Initialize {
	int i = 0;
	
	public static void main(String args[]) {
		Initialize t = new Initialize();
		Initialize what = t;
		what.i = 1;
		System.out.println(t.i);
		Initialize which = new Initialize();
		which = t;
		which.i = 2;
		System.out.println(t.i);
	}
}
