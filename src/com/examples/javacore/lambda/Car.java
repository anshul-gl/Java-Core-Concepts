package com.examples.javacore.lambda;

public class Car {
	String name;
	int price;
	
	Car(String name,int price)
	{
	this.name=name;
	this.price=price;
	}
	int getPrice()
	{
		return price;
	}
	String getname()
	{
		return name;
	}
	void print()
	{
		System.out.println(name);
	}
}

