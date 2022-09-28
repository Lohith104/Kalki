package kalki;

public class Immutable_string {
	public static void main(String[] args) {
		String a="Lohith";
		String b="Kalki";
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		String c=a.concat(b);//or c=a+b gives same output
		System.out.println(System.identityHashCode(c)+a+b);
		
		
	}

}
