package org.technoelevate.mediaplayerApp;

public class demo
{
	public static void main(String[] args) {
		String st ="sunil123";
		String name="";
		String num="";
		char c[]= st.toCharArray();
		for(int i=0 ;i<c.length;i++)
		{
			if(c[i]>='A'&&c[i]<='Z')
				name=name+c[i];
			else if(c[i]>='a'&&c[i]<='z')
				name=name+c[i];
			else if(c[i]>='0'&&c[i]<='9')
				num=num+c[i];
		}
		System.out.println(name);
		System.out.println(num);
	}

	
}
