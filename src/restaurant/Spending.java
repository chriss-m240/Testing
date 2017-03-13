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
public class Spending {
    
    private String type;
    private String date;
    private String description;
    private double value;

    public Spending(String type, String date, String description, double value) {
        this.type = type;
        this.date = date;
        this.description = description;
        this.value = value;
    } 

    public double getValue() {
        return value;
    }
    
    
    
}
