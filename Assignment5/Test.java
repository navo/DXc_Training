package com.test;

import com.shape.Rectangle;
import com.shape.Square;
public class Test {
	public static void main() {
		Square square=new Square(4);
		Rectangle rectangle=new Rectangle(12,2);
		square.getArea();
		square.getPerimeter();
		rectangle.getArea();
		rectangle.getPerimeter();
		
	}
	

}
