package com.musala.training.design.patterns.behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Employee emp = new Employee();
        emp.setName("Vladimir");
        emp.setAddress("Kole Nedelkovski");
        emp.setPhone("888-555-1212");

        System.out.println("Employee before save:    " + emp);

        careTaker.save(emp);
        emp.setPhone("230-895-1212");

        careTaker.save(emp);

        System.out.println("Employee after modification:    " + emp);

        emp.setPhone("123123-1231-123");

        careTaker.revert(emp);

        System.out.println("Employee to last save point:    " + emp);

        careTaker.revert(emp);

        System.out.println("Employee revert to original:    " + emp);

    }

}
