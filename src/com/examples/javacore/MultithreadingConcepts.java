package com.examples.javacore;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Runnable Example class implements multithreading using runnable interface
 * and also use reentrant lock to lock resource
 */
class RunnableExample implements Runnable {
	private Thread t;
	private String threadName;
	private ArrayList<StudentDetails> studentList;

	private ReentrantLock lock;
	private StudentAccessor accessor;

	RunnableExample(String name, ArrayList<StudentDetails> studentList , StudentAccessor accessor) {
		threadName = name;
		this.accessor = accessor;
		this.studentList = studentList;
		lock = new ReentrantLock();
		System.out.println("Creating " + threadName);
	}

	/*
	 * Overriding the run method of the runnable interface and locks the accessor method
	 * which is used to access the details of the student implented in StudentAccessor class	 
	 */
	public void run() {

		accessor.accessing(studentList, threadName);

	}
	/*
	 * Overriding a start method and creating a thread whn new instance of thread is created
	 */
	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
/*
 * Thread Example class implements multithreading using thread class
 * and also use synchroniized method for thread safe
 */
class ThreadExample extends Thread {
	   private Thread t;
	   private String threadName;
	   private ArrayList<StudentDetails> studentList;
	   
	   ThreadExample(String name, ArrayList<StudentDetails> studentList) {
	      threadName = name;
	      this.studentList = studentList;
	      System.out.println("Creating " +  threadName );
	   }
	   /*
	    *Overriding run method and synchronising it to make thread safe
	    *Prints Student Details 	    
	    */
	   public synchronized void run() {
	      System.out.println("Running " +  threadName );
	      try {
	         for(StudentDetails studentObj : studentList) {
	            System.out.println("Thread: " + threadName + " is accessing the following student details , " + studentObj.getName());
	            Thread.sleep(50);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
}

/*
 * Implements the Multithreading Concepts Using the Student Details Class and
 * making threads
 
 */
public class MultithreadingConcepts {
	public static void main(String args[]) {
		StudentAccessor studentAccessor = new StudentAccessor();
		ArrayList<StudentDetails> studentList = new ArrayList<StudentDetails>();
		studentList.add(new StudentDetails("Amit", 1, 400));
		studentList.add(new StudentDetails("Anshul", 2, 350));
		studentList.add(new StudentDetails("Pushkar", 3, 250));
		studentList.add(new StudentDetails("Shivam", 4, 330));

		/*
		 * thread will run after thread one has finished working 
		 * with the resource and then thread two will run
		 */
		RunnableExample R1 = new RunnableExample("Teacher-1", studentList , studentAccessor);
		R1.start();

		RunnableExample R2 = new RunnableExample("Teacher-2", studentList , studentAccessor);
		R2.start();

		/*
		 * Output will vary everytime depending on which thread takes control over the resource
		 */
//	    System.out.println("-----------------------------------------------------------------------");
//
//	    ThreadExample T1 = new ThreadExample( "Thread-1", studentList);
//	    T1.start();
//	      
//	    ThreadExample T2 = new ThreadExample("Thread-2", studentList);
//	    T2.start();

	}
}
