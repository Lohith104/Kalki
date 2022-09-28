package kalki;

public class Duplicates_string {
	public static void main(String[] args) {
		String p="MalayalaM";
		String p1="";
		for(int i=p.length()-1;i>-1;i--) {
			p1=p1+p.charAt(i);
			}
		System.out.println(p1);
		
			if ( p.equals(p1)) 
				System.out.println("is a palindrome");
			else 
                System.out.println("is not a palindrome");
			
		}
	}


