/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author chris
 */
public class Worker {
    
    private String name;
    private String role;
    private double Salary;
    private Hour[] hours;

    public Worker(String name, String role, double Salary) {
        this.name = name;
        this.role = role;
        this.Salary = Salary;
        this.hours = new Hour[10];
    }
    
    
    
    public double getSalary(){
        return this.Salary;
    }
    
}
