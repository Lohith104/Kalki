package kalki;

public class Replace_anothercharinastring {
	public static void main(String[] args) {
		String l="I am a Mechanical Engineer";
		String[] q = l.split(" ");
		//String l1=" ";
		for(int i=0;i<q.length;i++) {
			String y=q[i];
		//	System.out.println(y);
			String replace = y.replace(y, "#");
		    System.out.print(replace+y.substring(1)+" ");
		
	
	}
	/*
	 * String [] v=l.split(""); for(int i=l.length();i>-1;i--) { char
	 * l1=l.charAt(i); String a=0; System.out.print(l1); }
	 */
}
}
