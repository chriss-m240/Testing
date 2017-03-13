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
public class Inventary {
    private Grocery[] groceries;
    private int nGroceries;

    public Inventary() {
        this.groceries = new Grocery[10];
    }
    
    
    public void addGrocery(Grocery newGrocery){
        this.groceries[nGroceries] = newGrocery;
    }
    
    public void listInventary(){
        for (Grocery grocerie : this.groceries) {
            System.out.println(grocerie);
        }
    }
    
}
