package ovels;

public class CEleinNum {

	public static void main(String[] args) {
		int num=23188888;
		int count=0;
		int find=8;
		while(num!=0)
		{
			int rem=num%10;
			if(rem==find)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(count);

	}

}
