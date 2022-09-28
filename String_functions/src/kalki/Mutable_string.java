package kalki;

public class Mutable_string {
	public static void main(String[] args) {
		StringBuffer j=new StringBuffer("Lohith");
		StringBuffer k=new StringBuffer("Kalki");
		System.out.println(System.identityHashCode(j));
		System.out.println(System.identityHashCode(k));
		StringBuffer c=j.append(k);
		
		System.out.println(System.identityHashCode(c));
		System.out.println(c);
	}

}
