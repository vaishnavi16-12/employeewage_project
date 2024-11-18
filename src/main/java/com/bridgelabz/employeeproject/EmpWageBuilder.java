package com.bridgelabz.employeeproject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

            System.out.println("........Daily Wages.......");
            for (String k : cew.totalWagesRecord.keySet()) {
                System.out.println(k + ": " + cew.totalWagesRecord.get(k));
            }
        }
        String query="Amazon";
        System.out.println(getTotalWageByCompany(query,emp.empWages));
    }

    private static String getTotalWageByCompany(String query, ArrayList<CompanyEmpWage> empWages2) {
        for (CompanyEmpWage c : empWages2) {
            if (c.companyName.equals(query)) {
                return "Total Wage: " + c.totalWage;
            }
        }
        return "Company not found!";
    }

    @Override
    public void calculateTotalWage(CompanyEmpWage companyEmpWages) {

        int wage = 0;
        int workingHours = 0;
        int workingDays = 0;
        Map<String, Long> dailyWages=new HashMap<String, Long>();
        while (workingDays < companyEmpWages.MAX_WORKING_HRS && workingHours < companyEmpWages.MAX_WORKING_DAYS) {
            workingDays++;
            if (companyEmpWages.employeePresent()) {
                workingHours += companyEmpWages.fullTimeHour;
                wage =  companyEmpWages.WAGE_PER_HR;
                dailyWages.put("Day" + workingDays,(long) companyEmpWages.WAGE_PER_HR);
            }
            else {
                dailyWages.put("Day"+workingDays,(long)0);
            }
        }
        companyEmpWages.setTotalMonthlyWage(wage);
        companyEmpWages.setTotalWagesRecord(dailyWages);
    }
}