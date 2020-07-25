package com.shape;

public class Square implements Polygon {
	float side;
	public Square(float side) {
		super();
		this.side = side;
	}
	public void getPerimeter()
	{
		float perimeter=4*this.side;
		System.out.println("perimeter of square= "+perimeter);
	}
	   public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	public void getArea() {
		      float area = this.side * this.side;
		      System.out.println("The area of the square is "+area);
		   }
}
