package ovels;

public class icon2 {

	public static void main(String[] args) {
		String s="Rajashekar";
		 char[] ch=s.toCharArray();
		 int count=0;
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u')
			 {
		
				 System.out.println(i+"  "+ch[i]);
			 }
		 }
		 

	}

}
