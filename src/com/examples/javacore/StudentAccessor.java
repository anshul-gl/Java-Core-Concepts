package com.examples.javacore;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/*

* The StudentAccessor  Class uses StudentDetails Class and provides locks for threads
* trying to access same resource and print Student Details

*/
public class StudentAccessor {

	private ReentrantLock lock;
	/*
	 * Initializing a reentrantlock to block resources 

	*/
	public StudentAccessor() {
		lock = new ReentrantLock();
	}
	
	/*

	* Accessing method print Student details but before that 
	* attains a lock via .lock method and prevents other threads to use
	* until one has released the lock by .unlock method
	* Concept used-->Reentrant lock and Multithreading 

	*/
	public void accessing(ArrayList<StudentDetails> list , String threadName) {
		lock.lock();
		
		for (StudentDetails studentObj : list) {
			System.out.println("Thread: " + threadName + " is accessing the following student details , "
					+ studentObj.getName());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		lock.unlock();
	}
}
