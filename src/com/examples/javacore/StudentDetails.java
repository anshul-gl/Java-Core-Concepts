package com.examples.javacore;

import java.util.Comparator;

/*

* The Student Details Class represents details of a particular
* student with name id and marks as attributes which will be used in
* various java core concepts that are represented in attached classes.

*/
public class StudentDetails implements Comparable<StudentDetails>,Comparator
{
    private String name;
    private int id;
    private int marks;
 
    public String getName() {
		return name;
	}


	public int getMarks() {
		return marks;
	}


	public int getId() {
		return id;
	}

	public StudentDetails()
	{
		
	}

	public StudentDetails(String name, int id,int marks)
    {
        this.name = name;
        this.id = id;
        this.marks=marks;
    }
 
    @Override
    /*

    * Overriding hashcode method and setting id as hashkey
    
    */
    public int hashCode()
    {
        return id;
    }
 
    @Override
    /*

    * Overriding equals method on id of objects
    
    */
    public boolean equals(Object obj)
    {
        StudentDetails studentObj = (StudentDetails) obj;
        return (id == studentObj.id);
    }
 
    @Override
    /*

    * Overriding toString method and it will return details of a student
    * Concepts used --> overriding methods of object class for string representation of object
    */
    public String toString()
    {
        return id+" : "+name;
    }
    
	@Override
    /*

    * Overriding compare method and comparing objects on the basis of id
    * and if id are equal than comparing it by name
    * Concepts used --> overriding methods of object class and customize comparison for sorting
    
    */
	public int compare(Object o1, Object o2) {
		StudentDetails studentobj1 = (StudentDetails)o1;
		StudentDetails studentobj2 = (StudentDetails)o2;
		
		if (studentobj1.id > studentobj2.id)
		{
			return 1;
		}
		else if(studentobj1.id < studentobj2.id)
		{
			return -1;
		}
		else
		{
			return studentobj1.getName().compareTo(studentobj2.getName());
		}
		
	}


	@Override
    /*

    * Overriding compareTo method and comparing objects on the basis of id
    * and if id are equal than comparing it by name
    * Concepts used --> overriding methods of object class and customize comparison for sorting
    
    */
	public int compareTo(StudentDetails o) {
		StudentDetails studentobj1 = (StudentDetails)o;
		
		if (id > studentobj1.id)
		{
			return 1;
		}
		else if(id < studentobj1.id)
		{
			return -1;
		}
		else
		{
			return name.compareTo(studentobj1.getName());
		}
	}
}
