package com.bridgelabz.employeeproject;

public class EmployeeWageMain {
   public static void main(String []arg){
       System.out.println("Welcome to Employee Wage Project");

       final int FULL_TIME = 1;
       double empType = Math.floor(Math.random() * 10) % 2;
       if (empType == FULL_TIME)
       {
           System.out.println("Employee is Present");
       }
       else
       {
           System.out.println("Employee is Absent");
       }
   }


}
