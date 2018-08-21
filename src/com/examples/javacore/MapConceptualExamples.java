package com.examples.javacore;
import java.util.*;


/*
 * Tree Map Concepts takes StudentDetails object and shows the result in sorted order
 * Uses the comparator interface to  implement the customised compare method defined in 
 * Student Details Class
 */
class TreeMapConcepts
{
	private Map<Integer, StudentDetails> treeMap;
	public TreeMapConcepts(Map<Integer, StudentDetails> treeMap)
	{
		this.treeMap = treeMap;
	}
	public void printTreeMap()
	{
		for (Map.Entry<Integer, StudentDetails> entry : treeMap.entrySet()) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }		
	}
}
/*
 * Hash Map Concepts takes StudentDetails object and shows the result in random order
 * Shows the basic retrieval and removal of keys 

 */
class HashMapConcepts
{
	private Map<Integer, StudentDetails> hashMap;
	public HashMapConcepts(Map<Integer, StudentDetails> hashMap)
	{
		this.hashMap = hashMap;
	}
	//print the hash map
	public void printHashMap()
	{
		for (Map.Entry<Integer, StudentDetails> entry : hashMap.entrySet()) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }		
	}
	//delete all key value pair from the map
	public void deleteAllKeyValuePair()
	{
		hashMap.clear();
	}
	//remove a key value pair from the map
	public void removeKeyValuePair(Integer key,StudentDetails studentobj)
	{
		hashMap.remove(key,studentobj);
	}
}
/*
 * Map Conceptual Classes implements map concepts which includes tree map and hash map
 */
public class MapConceptualExamples {

	public static void main(String[] args) {
		 Map<Integer,StudentDetails> hashMap=new HashMap<Integer,StudentDetails>();  
		   
		 hashMap.put(021,new StudentDetails("Anshul", 021,400));//how to add key value pair
		 hashMap.putIfAbsent(108,new StudentDetails("Rakesh", 108, 400));//add if if absent
		 hashMap.put(105,new StudentDetails("Suresh", 105,450));
		 hashMap.put(415,new StudentDetails("Ramesh", 415,500));    
		 hashMap.put(814,new StudentDetails("Nikhil", 814,350));
		 hashMap.put(105,new StudentDetails("Shubham", 105,300));      //Duplicate Element
		 hashMap.put(879,new StudentDetails("Sapna", 879,250));		  
		 hashMap.put(105,new StudentDetails("Ravi", 105,290));        //Duplicate Element and will replace other 105 element

		 HashMapConcepts hashMapConcepts = new HashMapConcepts(hashMap);
		 hashMapConcepts.printHashMap();

		 System.out.println("-----Converting to a Tree Map----------\n");
		 
		 System.out.println("Ascending order\n");
		 
		 Map<Integer,StudentDetails> treeMap=new TreeMap<Integer,StudentDetails>(hashMap);//ways to create map  
		 
		 TreeMapConcepts treeMapConcepts = new TreeMapConcepts(treeMap);
		 treeMapConcepts.printTreeMap();
		 


	}

}
