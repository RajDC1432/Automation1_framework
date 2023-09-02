package ovels;

public class swstr {

	public static void main(String[] args) {
		 
		String s="java";
		String a="mava";
		s=s+a;
		a=s.substring(0, (s.length()-a.length()));
		s=s.substring(a.length());
		System.out.println("S-->"+s);
		System.out.println("a-->"+a);
        
	}

}
