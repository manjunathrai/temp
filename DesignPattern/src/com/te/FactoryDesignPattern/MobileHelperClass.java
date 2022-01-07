package com.te.FactoryDesignPattern;

public class MobileHelperClass 
{
	Mobile mobile;
	void getMobile(String s)
	{
		
		if(s.equalsIgnoreCase("IPhone"))
		{
			mobile = new Iphone11();
		}
		else if(s.equalsIgnoreCase("Samsung"))
		{
			mobile = new Samsung();
		}
		else if(s.equalsIgnoreCase("Redmi"))
		{
			mobile =  new Redmi();
		}
		else
		{
			System.err.println("No Mobile Found");
		}
		if(mobile!=null)
		{
			mobile.call();
			mobile.message();
			mobile.image();
		}
	}
}
