package com.bridgelabz.employeeproject;

public class EmpWageBuilder implements CalculateEmpWage  {

    private CompanyEmpWage[] empWages;

    public EmpWageBuilder() {
        empWages = new CompanyEmpWage[2];
    }

    public static void main(String []args)
    {
        EmpWageBuilder emp = new EmpWageBuilder();
        emp.empWages[0] = new CompanyEmpWage("Flipkart", 20, 20, 200);
        emp.calculateTotalWage(emp.empWages[0]);

        emp.empWages[1] = new CompanyEmpWage("Amazon", 4, 30, 150);
        emp.calculateTotalWage(emp.empWages[1]);

        for (int i = 0; i < 2; i++) {
            System.out.println(emp.empWages[i]);
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
                wage += companyEmpWages.WAGE_PER_HR;
            }
        }
        companyEmpWages.setTotalMonthlyWage(wage);
    }
}



