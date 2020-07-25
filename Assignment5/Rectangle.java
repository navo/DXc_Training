package com.shape;

public class Rectangle implements Polygon{
	float length,breadth;
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
public void getPerimeter() {
	float perimeter=2*(this.length+this.breadth);
	System.out.println("perimeter of square= "+perimeter);
		
	}
	public void getArea() {
	      float area = this.length* this.breadth;
	      System.out.println("The area of the rectangle is "+area);
	   }
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
}
