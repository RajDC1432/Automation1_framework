package ovels;

public class poc2 {

	public static void main(String[] args) {
		String s="Rajashekar";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
			{
				System.out.println(c);
			}
		}

	}

}
