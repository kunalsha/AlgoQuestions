package com.practice.ds.misc;

class GrandParent {
	void fun() {
		System.out.println("Grandparent");
	}
}

class Parent1 {
	void fun() {
		System.out.println("Parent1");
	}
}

class Parent2 {
	void fun() {
		System.out.println("Parent2");
	}
}

// Error : Test is inheriting from multiple
// classes
class DiamondCheck {//implements Parent1, Parent2 {
	public static void main(String args[]) {
		DiamondCheck t = new DiamondCheck();
		//t.fun();
	}
}

// public class DiamondCheck {
//
// public static void main(String[] args) {
// System.out.println("I am in Main");
//
// Dog dog = new Dog();
// dog.voice();
// dog.legs();
//
// Cat cat = new Cat();
// cat.voice();
// cat.legs();
// }
//
// }
//
// interface Life {
// String name;
// public abstract void voice();
// }
//
// abstract class Animal {
// String name;
//
// public String getName() {
// return name;
// }
//
// public void setName(String name) {
// this.name = name;
// }
// public abstract void voice();
// }
//
// class Dog implements Life {
//
// @Override
// public void voice() {
// System.out.println("We usually bark");
// }
//
// public void legs() {
// System.out.println("Have four legs");
// }
//
// }
//
// class Cat implements Life {
//
// @Override
// public void voice() {
// System.out.println("We usually meow");
// }
//
// public void legs() {
// System.out.println("Have four legs also");
// }
//
// }
//
// class ClassC extends Cat, Dog{
//
// }