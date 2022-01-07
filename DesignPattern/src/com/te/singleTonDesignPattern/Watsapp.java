package com.te.singleTonDesignPattern;

public class Watsapp 
{
//	private static Watsapp w =  new Watsapp();
	final  static Watsapp w =  new Watsapp();
	private Watsapp() {
	}
//	static Watsapp createObject()
//	{
//		if(w==null)
//		{
//		w= new Watsapp();
//		return w;
//		}
//		return w;
//	}

}
