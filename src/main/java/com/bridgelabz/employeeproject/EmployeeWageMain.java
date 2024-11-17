package com.bridgelabz.employeeproject;

public class EmployeeWageMain {
   public static void main(String []arg){
       System.out.println("Welcome to Employee Wage Project");

       final int FULL_TIME = 2;
       final int PART_TIME = 1;
       final int WAGE_PER_HR = 20;
       final int MAX_WORKING_DAYS = 20;
       final int MAX_WORKING_HRS = 100;
       int totalWage = 0;
       int workingHours = 0;
       System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

       for (int day = 1,totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
               && totalWorkingHrs < MAX_WORKING_HRS; day++, totalWorkingHrs += workingHours) {

           int empType = (int) (Math.random() * 10) % 3;

           switch (empType) {
               case FULL_TIME:
                   workingHours = 8;
                   break;
               case PART_TIME:
                   workingHours = 4;
                   break;
               default:
                   workingHours = 0;
                   break;
           }
           int wage = workingHours * WAGE_PER_HR;
           totalWage += wage;
           System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHrs + workingHours);
       }
       System.out.println("Total wage for a month is " + totalWage);
   }
}