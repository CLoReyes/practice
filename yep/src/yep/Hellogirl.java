package yep;

import java.util.Scanner;

public class Hellogirl 
{
		
	public static void main(String[] args) 
	{
		greetPlayer();
	
	}
	

	private static void greetPlayer() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String nombre =sc.nextLine();
		
		System.out.println("Hello "  + nombre + "!");		
	}


	

}
