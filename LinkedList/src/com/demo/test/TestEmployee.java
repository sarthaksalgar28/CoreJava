package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlist.SinglyEmployeeList;

public class TestEmployee {

	public static void main(String[] args) {
		
		SinglyEmployeeList liste = new SinglyEmployeeList();
		liste.addNode(new Employee(1,"Sarthak","Solapur"));
		liste.addNode(new Employee(2,"Ashish","Pune"));
		liste.addNode(new Employee(3,"Shanu","Dharashiv"));
		liste.addNode(new Employee(4,"Hrishi","Uttar Pradesh"));
		liste.displayData();
		liste.SearchById(1);
		liste.deleteById(2);
		liste.displayData();

	}

}
