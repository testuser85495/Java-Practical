package helloworld;

import java.util.Random;

interface inter1 {
	public void call();
}

abstract class abc {
	abstract public void call();

}

class calling extends abc implements inter1 {

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

}

class Az {
	public void call() throws ArithmeticException {
		System.out.println("az call");
	}
}

class Bc extends Az {
	public void call() throws ArithmeticException {
		super.call();
		System.out.println("bc call");
	}
}

class Cons {
	public Cons() {
		System.out.println("hello");
	}
}

class ChildCons extends Cons {
	public ChildCons() {
//		super();
		System.out.println("hi");
	}
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO");

		String s = "name"; // one object will create
		String s1 = new String("name");// Two object will create

		System.out.println(s);
		System.out.println(s1);

//		Random random = new Random();
//		
//		int x = random.nextInt(6)+1;
//		System.out.println(x);
//		calling calling=new calling();
//		calling.call();

		Bc bc= new Bc();
		bc.call();
//		
//		ChildCons c = new ChildCons();
	}

}
