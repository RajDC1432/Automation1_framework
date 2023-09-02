package ovels;

public class Selement2 {

	public static void main(String[] args) {
		int[] a= {1,4,5,5,3};
		int find=5,count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==find)
			{
				count++;
			}
		}
       System.out.println(count);
	}

}
