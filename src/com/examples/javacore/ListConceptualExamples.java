package com.examples.javacore;

import java.util.*;

/*
 * Implements array list concepts which takes arraylist as an input
 * and showcase that remove is done by default on index by raising the exception
 * Also it contains duplicate and heterogenous elements 
 * and user can check whether the given element is present ii the array
 */
class ArrayListConcepts
{
	private ArrayList<Integer> arrayList;
	
	public ArrayListConcepts(ArrayList<Integer> arrayList)
	{
		this.arrayList = arrayList;
	}
	/*
	 * It takes arraylist and proves that element is removed by default
	 * on index using remove method and raise exception when index is out
	 * of bounds
	*/
	public void checkDefaultRemoveTakesIndex()
	{
		int i = 0;
		while(true)
		{
			
			try
			{
				arrayList.remove(i);
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("This proves that element was removed by index ");
				break;
			}
			i++;
		}
	}
	/*
	 * Takes arraylist and returns true if specified element is present in the arraylist
	 */
	public boolean checkElementExist(Integer searchForNumber)
	{
		return arrayList.contains(4);
	}
	public void printArrayList()
	{
		for(Integer items :arrayList)
		{
			System.out.print(items + " ");
		}
	}
	/*
	 *Removes duplicate element from the array list using set
	 */
	public ArrayList<Integer> removeDuplicates()
	{
		Set<Integer> uniqueList = new HashSet<Integer>();
		uniqueList.addAll(arrayList);
		arrayList.clear();
		arrayList.addAll(uniqueList);
		return arrayList;
	}
	
}
/*
 * LinkedList showcase the concepts of using linkedlist which are
 *	Elements maintains order and how to use the list iterator
 */
class LinkedListConcepts
{
	private LinkedList<Integer> linkedList;
	
	public LinkedListConcepts(LinkedList<Integer> linkedList)
	{
		this.linkedList = linkedList;
	}

	public void printLinkedList()
	{
		Iterator<Integer> it = linkedList.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
	}
	
}
/*
 * List Connceptual Examples class showcase different concepts related to list and iterators
 * It implements Linked list and Array List
 */
public class ListConceptualExamples {

	public static void main(String[] args) {
		
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);//append element on last position
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(4, 5);//adding on the basis of index
		integerList.add(6);
		integerList.add(7);
		integerList.add(8);
		integerList.add(8);
		integerList.add(8);
		integerList.add(9);
		integerList.add(9);
		integerList.add(9);
		integerList.add(10);
        
        ArrayListConcepts arrayConcepts = new ArrayListConcepts(integerList);
        arrayConcepts.printArrayList();
        System.out.println("\n" + " The number exists or not :" + arrayConcepts.checkElementExist(4));
        ArrayList<Integer> uniqueArray = arrayConcepts.removeDuplicates();
        System.out.println(uniqueArray);
        arrayConcepts.checkDefaultRemoveTakesIndex();
        
		LinkedList<Integer> integerLinkedList = new LinkedList<Integer>(integerList);

		integerLinkedList.addFirst(5);//add at the begining
		integerLinkedList.addLast(6);//add at the last
        
		LinkedListConcepts linkedListConcepts = new LinkedListConcepts(integerLinkedList);
		linkedListConcepts.printLinkedList();
		


	}

}
