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
public class Product {
    
    private String name;
    private double cost;
    private Grocery[] ingredients;
    private double value;

    public Product(String name, double cost, Grocery[] ingredients) {
        this.name = name;
        this.cost = cost;
        this.ingredients = ingredients;
    }
    
    public Grocery[] getIngredients(){
        return this.ingredients;
    }

    public double getValue() {
        return value;
    }
    
    
    
}
