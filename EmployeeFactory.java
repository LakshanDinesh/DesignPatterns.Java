package com.company.factory;

public class EmployeeFactory {

    public Employee getInstance(String type, String name, int hoursWorked, double rate){
        Employee employee = null;

        if(type.equals("hourly")) {
            employee = new HourlyEmployee("1", name, hoursWorked, rate);
        }

        else if(type.equals("monthly")) {
            employee = new MonthlyEmployee("2", name, rate);
        }

        else if(type.equals("daily")) {
            //todo - create the daily employee
        }
        else if(type.equals("contract")) {
            return new ContractBasis("5", name, rate);
        }
        return employee;
    }
}
