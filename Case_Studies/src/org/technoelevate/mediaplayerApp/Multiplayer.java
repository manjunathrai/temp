package org.technoelevate.mediaplayerApp;
import java.util.ArrayList;
import java.util.Scanner;
public class Multiplayer 
{
	public static void main(String[] args) {
	
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("dua");
		ar.add("Tum Mile");
		ar.add("Soul of dia");
		ar.add("RajaKumara");
		ar.add("Ek Raat");
		ar.add("bolna");
		ar.add("Happy");
		home(ar);
	}
	private static void home(ArrayList<String> ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the option : ");
		System.out.println("1 . Play Songs");
		System.out.println("2 . search Songs");
		System.out.println("3 . add/delete Songs");
		System.out.println("Enter Exit to close a Application");
		String n = sc.next();
		option(ar,n);
	}
	private static void option(ArrayList<String> ar, String n) {
		if(n.equalsIgnoreCase("1"))
			playSong(ar);
		else if(n.equalsIgnoreCase("2"))
			searchSong(ar);
		else if(n.equalsIgnoreCase("3"))
			addSong(ar);
		else if(n.equalsIgnoreCase("Exit"))
			return;
		else
			home(ar);
	}
	private static void addSong(ArrayList<String> ar) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select option");
		System.out.println("1 . Add Song");
		System.out.println("2 . Delete Song");
		System.out.println("3 . Home");
		int n=sc.nextInt();
		if(n==1)
			add(ar);
		else if(n==2)
			delete(ar);
		else if(n==3)
			 home(ar);
		else {
			System.out.println("invalid option");
			home(ar);
		}
	}
	private static void add(ArrayList<String> ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the song to add : ");
		System.out.println();
		String st= sc.nextLine();
		if(ar.contains(st))
		{
			System.out.println(st+" is already present");
		}
		else {
		ar.add(st);
		System.out.println("Song added successfully");}
		home(ar);
	}
	private static void delete(ArrayList<String> ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the song to delete : ");
		System.out.println();
		for(int i=0;i<ar.size();i++)
		{
			System.out.println((i+1)+" : "+ar.get(i));
		}
		String st= sc.nextLine();
		if(ar.contains(st)) {
		ar.remove(st);
		System.out.println("Song removed Successfully");
		}
		else
			System.out.println("Song not present");
		home(ar);
	}
	private static void playSong(ArrayList<String> ar) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select option");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println((i+1)+" : "+ar.get(i));
		}
		System.out.println((ar.size()+1)+" : "+"Random Song");
		System.out.println((ar.size()+2)+" : "+"home");
		int n= sc.nextInt();
		if(n<=ar.size()&&n!=0) {
		System.out.println(ar.get(n-1)+" song is playing");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		home(ar);
		}
		else if(n==ar.size()+1) {
			randomsong(ar);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			home(ar);
		}
		else if(n==ar.size()+2)
			 home(ar);
		else {
			System.out.println("invalid option");
			home(ar);
		}
	}
	private static void randomsong(ArrayList<String> ar) {
			int range = ar.size();
			int rand = (int)(Math.random()*range)+1;
			System.out.println(ar.get(rand-1)+" is playing");
		
		
		
	}
	private static void searchSong(ArrayList<String> ar) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song to be searched : ");
		System.out.println(" 1 . Home");
		String ref = sc.nextLine();
		if(ref.equals("1"))
			 home(ar);
		else {
		boolean rs= false;
		for(int i=0; i<ar.size();i++)
		{
			if(ar.get(i).equalsIgnoreCase(ref))
				rs=true;
		}
		if(rs) {
			System.out.println(ref+" Song is playing");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			home(ar);
		}
		else
		{
			System.out.println("No song found");
			System.out.println();
			home(ar);
		}
		}
	}
}
