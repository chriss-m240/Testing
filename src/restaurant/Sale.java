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
public class Sale {
    
    private String date;
    private Client sale;    

    public Sale(String date, int table) {
        this.date = date;
        this.sale = new Client(table);
    }
    
    public Client getSale() {
        return this.sale;
    }
   
}
