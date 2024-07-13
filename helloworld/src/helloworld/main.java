package helloworld;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO");
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1;
		System.out.println(x);
	}

}
