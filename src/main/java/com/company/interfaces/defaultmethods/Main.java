package com.company.interfaces.defaultmethods;

public class Main {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        employeeDAO.despedirse();
    }
}
