package com.examples.javacore;

/*
 * Calculate height class determines height in cms from feet and inches
 * and also showcase overloading concept
 * Concept Covered --> overloading by different parameters different signatures and 
 * if automatically type casting of the values to its upper class if not found same
 
 */
class CalculateHeightInCms
{
	/*
	 * calculate height from feets in cms
	 */
	public double caluculateHeight(int feet)
	{
		System.out.println("First Method is called");
		return feet*12*2.54;
	}
	/*
	 * Calculates height in cms from feet and inches
	 */
	public double caluculateHeight(int feet, int inches)
	{
		System.out.println("Second Method is called");
		return (feet*12+inches)*2.54;
	}
	/*
	 * Calculates height in cms from feet and inches
	 */
	public double caluculateHeight(double feet, double inches)
	{
		System.out.println("Third Method is called");
		return (feet*12+inches)*2.54;
	}
	
}

/*
 * Movie class is parent class of annabelle which ha Movie name and genre methods
 * Concepts used is method overriding
 
 */
class Movie
{
	private String name;
	public Movie(String name)
	{
		this.name=name;
	}
	public String genre()
	{
		return "No genre";
	}

}
/*
 * Annabelle is the child class of Movie which extennds its genre method and implements it
 
 */
class Annabelle extends Movie
{

	public Annabelle() {
		super("Annabelle");
		// TODO Auto-generated constructor stub
	}
	public String genre()
	{
		return "Thriller Mystery";
	} 
	
}

public class PolymorphismConcepts {
	public static void main(String args[])
	{
		// overriding
		Movie movie1 = new Movie("Unnamed");
		System.out.println("Movie genre is " + movie1.genre());
		
		Movie movie2 = new Annabelle();
		System.out.println("Movie genre is " + movie2.genre());
		
		//overloading
		//1)Different parameters
		//2)Different signatures
		//3)typecasting automatically
		
		CalculateHeightInCms heightInCms = new CalculateHeightInCms();

		System.out.println(heightInCms.caluculateHeight(5) + "cms");
		System.out.println(heightInCms.caluculateHeight(5,12) + " cms");
		System.out.println(heightInCms.caluculateHeight(5,6.5) + " cms");
		
	}

}
