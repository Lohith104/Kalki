package kalki;

public class Functions_of_string {
	public static void main(String[] args) {
		
		String l="Lohith Mechanical engineer  ";
	    String l1="Lohith mechanical Engineer";
	    
	    int k = l.length();// length of the string
	    System.out.println(k);
	    
	    boolean b = l.equals(l1);//checks whether both strings are same with respect t0 
	    System.out.println(b);// the string's capital letter ,spaces etc
	    
	    boolean c = l.equalsIgnoreCase(l1);// checks both booth strings are equal
	    System.out.println(c);//irrespective of their lower and upper case
	    
	    String g = l.toUpperCase();
	    System.out.println(g);// converts the string to UPPER CASE
	    
	   String t = l1. toLowerCase();//converts to lower case
	   System.out.println(t);
	   
	   boolean d = l.startsWith("Lohit");//checks whether the string starts with the
	   System.out.println(d);//given string or char in method ()
	   
	   boolean e = l.endsWith(" engineer  ");// checks whether the string ends with the 
	   System.out.println(e);//given string or char in method
	   
	   boolean f = l.contains("e");//checks the string contains the given string
	   System.out.println(f);//or char in the giver method()
	   
	  int i = l1.indexOf("e");//prints the value of the char in string 
	  System.out.println(i);//for same chars in a string the first char is printed
	  //string starts from 0 as index value
	  int j = l.lastIndexOf("e");//prints the value of char  
	  System.out.println(j);//for same char in a string last char is printed
	  
	  char h = l1.charAt(7);//without calculating the spaces index of char is printed
	  System.out.println(h);
	  
	  String q = l1.replace("mechanical ", "BEMechanical");
	  System.out.println(q);//replaces the old string with the new string
	  
	  String o = l.substring(6);//prints the string from the given index value
	  System.out.println(o);
	  
	  boolean m = l.isEmpty();//prints true if the string is empty
	  System.out.println(m);//false if the string is present
	  
	  String[] p = l1.split(" ");//splits the paragraph or a sequence of strings with reference to 
	  System.out.println(p);//to any symbols with spaces etc 
	  for (String don : p) {
		  System.out.println(don);
		  }//"for each" loop is used to split the strings
	  
	  String y = l.trim();//removes all the white spaces before the first string and
	  System.out.println(y);//removes all the white spaces after the last string 
	  
	  String x = l.substring(3, 17);//Prints the text only between the starting index and
	  System.out.println(x);//and end index
	  
	  
	  
	  
		
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}


