package org.te.crudApp;

import java.util.Scanner;

public class Test 
{
	
	public static void main(String[] args) {
			home();
			
	}
	static void home()
	{
		 Scanner sc=new Scanner(System.in);
		System.out.println("Select the option");
		System.out.println("1 . add song");
		System.out.println("2 . delete song");
		System.out.println("3 . Update song");
		System.out.println("4 . Search song");
		System.out.println("5 . play song");
		System.out.println("Type exit to close the application");
		String n = sc.next();
		//sc.close();
		option(n);
	}
	private static void option(String n) {
		if(n.equalsIgnoreCase("1")) {
		 Crud_Feature.add();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("2")) {
		Crud_Feature.delete();
		 
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("3")) 
		{
		 Crud_Feature.update();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("4"))
		{
		 Crud_Feature.search();
		 try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("exit"))
		{
			System.out.println("Thank You");
			Crud_Feature.finalExit();
		}
		else if(n.equalsIgnoreCase("5"))
		{
		int res= Crud_Feature.playSong();
		 if(res==1)
		 try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 home();
		}
		else
		{
			System.out.println("Invalid option");
			home();
		}
	
	}
 
}
