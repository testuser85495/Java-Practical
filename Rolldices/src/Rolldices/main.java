package Rolldices;

import java.util.Random;

//import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

//import java.util.Random;

public class main {
	public static void main(String[] args) {
		Random random = new Random();
		
		int x = random.nextInt(111111) + 100000;
		System.out.println("OTP: "+x);
		hello();	
				
	}
	
	public static void hello()
	{
		System.out.println("hello");
	}
}
