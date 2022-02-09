package com.Maven_Project;

public class Pojo_B {
	public static void main(String[] args) {

		Pojo_A p = new Pojo_A();

		int a = p.getA();
		System.out.println(a);

		p.setA(20);
		int a2 = p.getA();
		System.out.println(a2);

	}
}
