package com.bridgelabz.employeeproject;

public class EmpWageBuilder {
    private CompanyEmpWage[] empWages;

    public EmpWageBuilder() {
        empWages = new CompanyEmpWage[2];
    }

    public static void main(String []args)
    {
        EmpWageBuilder emp = new EmpWageBuilder();
        emp.empWages[0] = new CompanyEmpWage("Flipkart", 20, 20, 200);
        emp.empWages[1] = new CompanyEmpWage("Amazon", 4, 30, 150);

        for (int i = 0; i < 2; i++) {
            System.out.println(emp.empWages[i]);
        }
    }
}



