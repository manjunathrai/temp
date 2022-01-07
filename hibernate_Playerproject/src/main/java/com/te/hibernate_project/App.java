package com.te.hibernate_project;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
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
			hibernate_player.add();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("2")) {
			hibernate_player.delete();
		 
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("3")) 
		{
			hibernate_player.update();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("4"))
		{
			boolean rs = hibernate_player.search();
			if(rs) {
		 try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
			
			home();
		}
		else if(n.equalsIgnoreCase("exit"))
		{
			System.out.println("Thank You");
			
		}
		else if(n.equalsIgnoreCase("5"))
		{
		boolean rs = hibernate_player.play();
		if(rs) {
		 try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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
