<<<<<<< HEAD
package day8.abstracts;
=======
//Program to demonstrate abstraction
package com.tnsif.dayeight.abstraction;
>>>>>>> branch 'master' of https://github.com/Fayaz2005/C2TC_CoreJavaPrograms.git

public class Square extends Shape{
	private float side;
	public Square()
	{
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	
	@Override
	void calArea() {
		super.area=side*side;		
	}
}

