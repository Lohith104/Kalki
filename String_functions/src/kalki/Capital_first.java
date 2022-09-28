package kalki;

public class Capital_first {
	public static void main(String[] args) {
		String p="I am a mechanical engineer";
		System.out.println(p);
		
		//String w=p.substring(1, 5);
		//System.out.println(e+w);
String[] r = p.split(" ");

for(int i=0;i<r.length;i++) {
	String t=r[i];
	//System.out.println(t);

	System.out.print(t.substring(0,1).toUpperCase()+t.substring(1)+" ");
	
	
	//System.out.println(t.substring(0, 1));

	
}
	}
}
