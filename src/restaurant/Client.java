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
public class Client {
    
    private int nTable;
    private Bill bill;

    public Client(int nTable) {
        this.nTable = nTable;
        this.bill = new Bill();
    }

    public double getValue(){
        return this.bill.gettValue();
    }
    
    
}
