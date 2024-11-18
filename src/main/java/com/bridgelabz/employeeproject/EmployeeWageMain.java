package com.bridgelabz.employeeproject;

public class EmployeeWageMain {

        public static void calculateTotalWage(String company, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS)
        {
            final int FULL_TIME = 2;
            final int PART_TIME = 1;
            int totalWage = 0;
            int workingHours = 0;
            System.out.println("Details of "+company+ " employee");
            System.out.println("Wage per hour "+WAGE_PER_HR);
            System.out.println("Maximum working hours "+MAX_WORKING_HRS);
            System.out.println("Maximum working days "+MAX_WORKING_DAYS);
            System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

            for (int day = 1,totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                    && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHours) {

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
            System.out.println("Total wage for a month of "+ company+ " employee is " + totalWage);
        }

        public static void main( String[] args ){
            System.out.println( "Welcome to Employee Wage Computation Program" );
            calculateTotalWage("Amazon", 20,16, 150);
            calculateTotalWage("Flipkart",40,20,100);
            calculateTotalWage("Nykaa",30,15,100);
            calculateTotalWage("Big Bazaar",20,20,200);
            calculateTotalWage("Dmart", 25,25, 150);
        }
    }