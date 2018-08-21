package com.examples.javacore;

import java.util.*;

/*

* The Hash Set Concept class implements the concepts of Hash Set
* takes hash set and perform print hashSet function

*/
class HashSetConcepts {
	private Set<StudentDetails> hashSet;

	public HashSetConcepts(Set<StudentDetails> hashSet) {
		this.hashSet = hashSet;
	}

	/*

	* Makes iterator and iterate over hash set
	
	*/
	public void printHashSet() {
		Iterator<StudentDetails> itr = hashSet.iterator();
		while (itr.hasNext()) {
			StudentDetails student = (StudentDetails) itr.next();
			System.out.println(student);
		}
	}

}

/*

* The Linked Hash Set Concept class implements the concepts of Hash Set
* takes Linked hash set and perform print LinkedhashSet function

*/
class LinkedHashSetConcepts {
	private Set<StudentDetails> hashSet;

	public LinkedHashSetConcepts(Set<StudentDetails> hashSet) {
		this.hashSet = hashSet;
	}
	/*

	* Makes iterator and iterate over linked hash set
	
	*/
	public void printHashSet() {
		Iterator<StudentDetails> itr = hashSet.iterator();
		while (itr.hasNext()) {
			StudentDetails student = (StudentDetails) itr.next();
			System.out.println(student);
		}
	}

}

/*

* The Tree Hash Set Concept class implements the concepts of Hash Set
* takes Tree hash set and perform print TreehashSet function

*/
class TreeSetConcepts {
	private Set<StudentDetails> hashSet;

	public TreeSetConcepts(Set<StudentDetails> hashSet) {
		this.hashSet = hashSet;
	}
	/*

	* Makes iterator and iterate over linked hash set
	
	*/
	public void printHashSet() {
		Iterator<StudentDetails> itr = hashSet.iterator();
		while (itr.hasNext()) {
			StudentDetails student = (StudentDetails) itr.next();
			System.out.println(student);
		}
	}

}
/*

* The  Set Conceptual Example class implements the concepts of different Sets
* using the Student Details clas and analyse the difference in the same

*/
public class SetConceptualExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<StudentDetails> set = new HashSet<StudentDetails>();
		set.add(new StudentDetails("Anshul", 021,400));
		set.add(new StudentDetails("Suresh", 105,450));
		set.add(new StudentDetails("Ramesh", 415,500));
		set.add(new StudentDetails("Nikhil", 814,350));
		set.add(new StudentDetails("Shubham", 105,250)); // Duplicate Element
		set.add(new StudentDetails("Sapna", 879,280));
		set.add(new StudentDetails("Ravi", 105,290)); // Duplicate Element
		
		/*Hash Set will take 105 entry and rest will be ignored since hash code is id
		 *  and will contain all unique elements
		 */
		
		HashSetConcepts hashSetConcepts = new HashSetConcepts(set);
		hashSetConcepts.printHashSet();

		System.out.print("\nCheck the order from hash set to linked hash set \n");

		/* 
		 * Linked Hash Set will be made through set collection and the output will show
		 * that elements maintain their order and cntains unique elements
		 
		 */
		Set<StudentDetails> linkedHashSet = new LinkedHashSet<StudentDetails>(set);

		LinkedHashSetConcepts linkedHashSetConcepts = new LinkedHashSetConcepts(linkedHashSet);
		linkedHashSetConcepts.printHashSet();

		System.out.print("\nCheck the ascending order in tree set \n");

		/* 
		 * Tree Hash Set is built using hash set and what output will show that 
		 * it is in asccending order and if the id is same then on the basis of string it will
		 * sort which was implemented in Student Details class 
		 */
		Set<StudentDetails> treeSet = new TreeSet<StudentDetails>(set);


		TreeSetConcepts treeSetConcepts = new TreeSetConcepts(treeSet);
		treeSetConcepts.printHashSet();

		System.out.println("Customising the comparator");
		
		/*
		 * Using the user defined comparator  NameComparator while sorting 
		 * 
		 */
		
		StudentDetails[] stuArr = new StudentDetails[set.size()];
		stuArr = set.toArray(stuArr);

		Arrays.sort(stuArr, new StudentDetails());

		for (StudentDetails studentDetails : stuArr) {
			System.out.println(studentDetails.getName()+" -> "+studentDetails.getId());
		}

	}

}
