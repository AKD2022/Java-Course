package Models;

import models.Item;
import models.Movie;

public class Store {
    Employee[] employees;

    public Store() {
        employees = new Employee[3];
    }

    public void setEmployees(int index, Employee employee) {
        this.employees[index] = new Employee(employee);
    }

    public void open() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                throw new IllegalStateException("You must be fully staffed before you open the store");
            }
        }
        System.out.println("We're open for business!");
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < employees.length; i++) {
            temp += employees[i] != null ? employees[i].toString() : "";
            temp += "\n";
        }
        return temp;
    }

    public void addMovie(Movie movie) {
    }

    public static void addItem(Item item) {
    }

}
