package com.examples.javacore.lambda;
import java.util.*;
import java.util.Arrays;
/*
 * @author anshul
 * sorting arrays alphabetically, by length
 */

class DemoLambdaUsage
{

	public void sortingByLengthIncreasingOrder(List<String> arr)
	{

		Collections.sort(arr, (p1,p2) ->p1.length()-(p2.length()));//comparator for length comparisons
		arr.forEach(y->System.out.println(y+" "));
	}
	public void sortingByLengthDecreasingOrder(List<String> arr)
	{

		Collections.sort(arr, (p1,p2) ->-(p1.length()-(p2.length())));//comparator for length comparisons
		arr.forEach(y->System.out.println(y+" "));
	}
}

public class BasicLambda{


	public static void main(String[] args) { 
		
		String tempArray[]= {"joey","rachel","ross","chandler","monica","pheobe"};
		List<String> arr=Arrays.asList(tempArray);
		
		DemoLambdaUsage demoLambdaUsage = new DemoLambdaUsage();
		BasicLambda basicLambda = new BasicLambda();
		
		

		System.out.println("---------sorting alphabatically---------------");
		Arrays.sort(tempArray);	
		for(String s:tempArray)//sorting by alphabetical order
			System.out.println(s);  

		System.out.println("\n-------------Sorting by ascending length---------");
		demoLambdaUsage.sortingByLengthIncreasingOrder(arr);//sorting by ascending length
		
		System.out.println("\n-------------Sorting by length decreasing---------");
		demoLambdaUsage.sortingByLengthDecreasingOrder(arr);	
		
		System.out.println("\n---------------Names with E--------------");

		arr.forEach(s1->{
			if(s1.indexOf('e')!=-1)
				System.out.println(s1);});
		
		System.out.println("\n--------------Names without E----------------");
		arr.forEach(s1->{
			if(s1.indexOf('e')==-1)
				System.out.println(s1);});
	} }
