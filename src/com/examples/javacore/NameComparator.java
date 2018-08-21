package com.examples.javacore;

import java.util.Comparator;

/*
 * Name Comparator class is user defined comparator which
 * defines the sorting method should be carried on basis of name 
 
 */
public class NameComparator implements Comparator<StudentDetails> {

	@Override
	/*
	 * Compare method of object class is overridden to compare objects on the basis of name	 
	 */
	public int compare(StudentDetails studentobj1, StudentDetails studentobj2) {
		return studentobj1.getName().compareTo(studentobj2.getName());
	}

}
