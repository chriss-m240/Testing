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
public class Restaurant {
    
    private Inventary inventary;
    private Worker[] workers;
    private Spending[] spendings;
    private int nSpendings;
    private int nSales;
    private int nWorkers;
    private Sale[] sales;

    public Restaurant() {
        this.inventary = new Inventary();
        this.workers = new Worker[3];
        this.spendings = new Spending[10];
        this.sales = new Sale[10];
    }
    
    public void addSpending(Spending s) {
        this.spendings[this.nSpendings] = s;
        this.nSpendings += 1;
    }
    
    public void addSale(Sale s) {
        this.sales[this.nSales] = s;
        this.nSales += 1;
        
    }
    
    public void addWorker(Worker w){
        this.workers[this.nWorkers] = w;
        this.nWorkers += 1;
    }
    
    public void removeWorker(int n) {
        this.workers[n] = null; 
    }

    public Spending[] getSpendings() {
        return spendings;
    }

    public Sale[] getSales() {
        return sales;
    }
    
    public double getProfit() {
        double s = 0;
        for (Sale sale : this.sales) {
            s += sale.getSale().getValue();
        }
        
        double st = 0;
        for (Spending spending : this.spendings) {
            st += spending.getValue();
        }
        
        return s - st;  
    }
          
}
