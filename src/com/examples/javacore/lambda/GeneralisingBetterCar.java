package com.examples.javacore.lambda;

public class GeneralisingBetterCar {

	Car betterCar(Car s1 , Car s2 ,TwoElementPredicate obj1)
	{
		if(obj1.str(s1,s2) == true)
			return s1;	
		else 
			return s2;	

	}
	public static void main(String[] args) {

		GeneralisingBetterCar ElementUtils=new GeneralisingBetterCar(); 
		Car car1=new Car("Maruti",100000);
		Car car2=new Car("BMW",5000000);
		Car betterCar=ElementUtils.betterCar(car1, car2, (c1, c2) -> c1.getPrice() > c2.getPrice());
		betterCar.print();
		


	}
}