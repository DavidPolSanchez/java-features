package com.company.records;

/*
Los Record son clases con datos inmutables (no hay setter ni posibilidad de modificar)
Se pueden usar como DTOs especialmente para recuperar datos

Evitan tener que escribir: constructor, getters, toString
 */
public class Main {

    public static void main(String[] args) {

        Person juan = new Person("juan", 33, 180);

        System.out.println(juan.age());
        System.out.println(juan.height());
        System.out.println(juan.name());
        System.out.println(juan);

        Person person2 = new Person("Antonio");
        System.out.println(person2);

        System.out.println(Person.LIFESPAN);

        Employee employee = new Employee("12242433FFDG");
        System.out.println(employee);

        Customer customer = new Customer("paco");
        System.out.println(customer);

    }
}

record Person(String name, Integer age, float height) {
    static final Integer LIFESPAN = 100;
    public Person(String name) {
        this(name, null, 0);
    }
    // TODO - investigar constructor vacío sin tener que delegar en otros
}
