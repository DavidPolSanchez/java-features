package com.company.interfaces.defaultmethods;

public interface EmployeeDAO {

    void saludar();

    default void despedirse(){
        System.out.println("hasta luego desde EmployeeDAO");
    }
}
