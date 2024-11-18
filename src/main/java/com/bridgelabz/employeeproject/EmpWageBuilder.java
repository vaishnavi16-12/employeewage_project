package com.bridgelabz.employeeproject;
import java.util.ArrayList;
public class EmpWageBuilder implements CalculateEmpWage  {


    private ArrayList<CompanyEmpWage> empWages;

        public EmpWageBuilder() {
            empWages = new ArrayList<CompanyEmpWage>();
        }

        public static void main(String []args)
        {
            EmpWageBuilder emp = new EmpWageBuilder();
            emp.empWages.add(new CompanyEmpWage("Flipkart", 20, 20, 200));

            emp.empWages.add(new CompanyEmpWage("Amazon", 4, 30, 150));

            for (CompanyEmpWage cew : emp.empWages) {
                emp.calculateTotalWage(cew);
            }
            for (CompanyEmpWage cew : emp.empWages) {
                System.out.println(cew);
            }

        }

        @Override
        public void calculateTotalWage(CompanyEmpWage companyEmpWages) {

            int wage = 0;
            int workingHours = 0;
            int workingDays = 0;
            while (workingDays < companyEmpWages.MAX_WORKING_HRS && workingHours < companyEmpWages.MAX_WORKING_DAYS) {
                workingDays++;
                if (companyEmpWages.employeePresent()) {
                    workingHours += companyEmpWages.fullTimeHour;
                    wage =  companyEmpWages.WAGE_PER_HR;
                }
            }
            companyEmpWages.setTotalMonthlyWage(wage);
        }
    }
