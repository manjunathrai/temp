import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args)
	{
		int ar[]= {0,11,5,6,7};
	//	Arrays.sort(ar);
		int max=ar[0];
		int min=ar[0];
		
		for(int i=1;i<ar.length;i++)
		{
			if(max<ar[i])
				max=ar[i];
			if(min>ar[i])
				min=ar[i];
		}
		System.out.println(max+min);
	}
}

