package com.company.interfaces.defaultmethods;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void saludar() {

    }

    @Override
    public void despedirse() {
        System.out.println("hasta luego desde EmployeeDAOImpl");
    }
}
