package com.perscholas.controller;
import com.perscholas.controller.EmployeController;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Hello World!" );
        EmployeController e = new EmployeController();
        //e.createEmployeeTable();
      
       // e.findEmployeeByname();
        //e.findEmployeeById();
        e.ShowOfficeCodes_AsDepartment();


	}

}
