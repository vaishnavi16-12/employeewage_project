package com.bridgelabz.employeeproject;

public class EmployeeWageMain {
   public static void main(String []arg){
       System.out.println("Welcome to Employee Wage Project");

       final int FULL_TIME = 2;
       final int PART_TIME = 1;
       int WAGE_PER_HR = 20;
       int workingHours = 0;
       int empType = (int) (Math.random() * 10) % 3;

       switch (empType) {
           case FULL_TIME:
               System.out.println("Employee is Present Full Time");
               workingHours = 8;
               break;
           case PART_TIME:
               System.out.println("Employee is Present Part Time");
               workingHours = 4;
               break;
           default:
               System.out.println("Employee is Absent");
       }
       int wage = workingHours * WAGE_PER_HR;
       System.out.println("Employee Daily Wage is " + wage);
   }
}