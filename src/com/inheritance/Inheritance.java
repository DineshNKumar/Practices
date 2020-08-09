package com.inheritance;

interface A {
	default void a() {
		System.out.println("bbb--123");
	}
}

interface B extends A {
	default void a() {
		System.out.println("aaa-123");
	}
}

public class Inheritance implements B {
	public static void main(String[] args) {
		new Inheritance().a();
	}
}
