<<<<<<< HEAD
package day8.abstracts;
=======
//Program to demonstrate abstraction
package com.tnsif.dayeight.abstraction;
>>>>>>> branch 'master' of https://github.com/Fayaz2005/C2TC_CoreJavaPrograms.git

public class Rectangle extends Shape{
	private float width, height;

	public Rectangle() {
		this.width = 5.0f;
		this.height = 2.0f;
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea() {
		area=width*height;		
	}
	

}
