package task;


//write a java program to solve multiple inheritance
interface A {
	public void fun1();

	public default void inter1() {
		System.out.println("inter 1");

	}
}

interface B extends A {
	public default void inter2() {
		System.out.println("inter 2");

	}
}

interface c {
	public void fun2();
	public default void inter3() {
		System.out.println("inter 3");

	}
}

class abc implements B, c {
	public void f() {
		System.out.println("hello world");

	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("hello fun2");

	}

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("hello fun1");

	}
}

public class MultipleInhritance {
	public static void main(String[] args) {
		
		abc xyz = new abc();
		xyz.inter1();
		xyz.inter2();
		xyz.inter3();
		
		A  a = new A() {
			
			@Override
			public void fun1() {
				
				// TODO Auto-generated method stub
				
			}
		};
		xyz.fun1();
	
		a.inter1();
		System.out.println("end");
				
		
	}

}
