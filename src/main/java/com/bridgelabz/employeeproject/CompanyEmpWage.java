package com.bridgelabz.employeeproject;

public class CompanyEmpWage {

        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final String companyName;
        final int WAGE_PER_HR;
        final int MAX_WORKING_DAYS;
        final int MAX_WORKING_HRS;
        int totalWage;
        int workingHrs;

        CompanyEmpWage(String companyName, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS)
        {
            this.companyName=companyName;
            this.WAGE_PER_HR=WAGE_PER_HR;
            this.MAX_WORKING_DAYS=MAX_WORKING_DAYS;
            this.MAX_WORKING_HRS=MAX_WORKING_HRS;
            totalWage=0;
            workingHrs=0;
            calculateTotalWage();
        }
        public void calculateTotalWage()
        {
            System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
            for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
            {
                int empType = (int) (Math.random() * 100) % 3;
                switch (empType)
                {
                    case FULL_TIME:
                        workingHrs = 8;
                        break;
                    case PART_TIME:
                        workingHrs = 4;
                        break;
                    default:
                        workingHrs = 0;
                        break;
                }
                int wage = workingHrs * WAGE_PER_HR;
                totalWage += wage;
                System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
            }
        }

        public String toString()
        {
            System.out.println("Details of " + companyName + " employee"+"\n"+"Wage per hour:" + WAGE_PER_HR+"\n"+"Maximum working days:" + MAX_WORKING_DAYS+"\n"+"Maximum working hours:" + MAX_WORKING_HRS+"\n");
            return "Monthly wage for an employee of company " + companyName + " is " + totalWage;
        }
    }

