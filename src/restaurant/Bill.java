/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.Date;

/**
 *
 * @author chris
 */
public class Bill {
    
    private Date date;
    private Product[] products;
    private double tValue;
    
    public void settValue() {
        for (int i = 0; i < products.length; i++) {
            this.tValue = products[i].getValue();     
        } 
    }

    public double gettValue() {
        return tValue;
    }
    
    
    
    
    
}
