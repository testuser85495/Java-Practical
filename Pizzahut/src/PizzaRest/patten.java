//* * * * *
//  * * * *
//    * * *
//      * *
//        *



package PizzaRest;


public class patten {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { 
			  
	        // first inner loop for printing white spaces 
	        for (int j = 0; j < 5; j++) { 
	            System.out.print("");
	        } 
	  
	        // second inner loop for printing star * 
	        for (int k = 0; k < i; k++) { 
	            System.out.print("* ");
	        } 
	        System.out.println();
	    } 

	}

}
