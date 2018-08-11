package com.practice.interview.IntPrep;

public class DecoratorDemo {
	
	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		redCircle.draw();
	}

	
	

}

interface Shape {
	void draw();
}

class Circle implements Shape {

	public void draw() {
		System.out.println("Printing Circle !!");
	}
	
}

abstract class ShapeDecorator implements Shape {
	protected Shape decorator;

	public ShapeDecorator(Shape decorator) {
		super();
		this.decorator = decorator;
	}
	
	public void draw() {
		decorator.draw();
	}
}

class RedShapeDecorator extends ShapeDecorator {
	
	public RedShapeDecorator(Shape decorator) {
		super(decorator);
	}

	@Override
	public void draw() {
		decorator.draw();
		System.out.println("Printing Red Circle !!");
		setBorderRed();
	}

	private void setBorderRed() {
		System.out.println("Making Border Red !!");
		
	}
	
}
