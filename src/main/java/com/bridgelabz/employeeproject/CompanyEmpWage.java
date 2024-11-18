package com.bridgelabz.employeeproject;
import java.util.Random;
public class CompanyEmpWage {


        final int fullTimeHour=8;
        final String companyName;
        final int WAGE_PER_HR;
        final int MAX_WORKING_DAYS;
        final int MAX_WORKING_HRS;
        int totalWage;

        public CompanyEmpWage(String companyName, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS)
        {
            this.companyName=companyName;
            this.WAGE_PER_HR=WAGE_PER_HR;
            this.MAX_WORKING_DAYS=MAX_WORKING_DAYS;
            this.MAX_WORKING_HRS=MAX_WORKING_HRS;
        }

        public void setTotalMonthlyWage(int totalWage){
            this.totalWage=totalWage;
        }

        boolean employeePresent()
        {
            return new Random().nextBoolean();
        }

        public String toString()
        {
            System.out.println("Details of " + companyName + " employee"+"\n"+"Wage per hour:" + WAGE_PER_HR+"\n"+"Maximum working days:" + MAX_WORKING_DAYS+"\n"+"Maximum working hours:" + MAX_WORKING_HRS+"\n");
            return "Monthly wage for an employee of company " + companyName + " is " + totalWage;
        }
    }
