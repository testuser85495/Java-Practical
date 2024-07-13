/*Write a program to make Simple calculator (to make addition, subtraction,
multiplication, division and modulo)*/

package calculator;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//		Object of calculator create 
		Cal cal= new Cal();
		cal.calq();
		
		
//		object of Circle Class 
		Circle circle = new Circle();
		circle.Area();
		
//		object of Square class
		Square square = new Square();
		square.sqr();
		
//		object of Cube class
		Cube cube = new Cube();
		cube.find_cube();
		
//		object of Triangle class
		Triangle triangle = new Triangle();
		triangle.FindTringle();
		
//		Object of Rectangle class
		AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
		areaOfRectangle.rectangle();
		
//		Object of Circumference class
		Circumference circumference = new Circumference();
		circumference.findcircumference();
		
//		Object of circumferenceOfTriangle class
		circumferenceOfTriangle cu = new circumferenceOfTriangle();
		cu.circumfrTringle();
		
		}
}



