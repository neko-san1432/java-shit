/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QTest;

/**
 *
 * @author benjiepabroa
 */
public class Order {
    String name;
    
    double total;
    
    public Order(String n, double t){
        name = n;
        total = t;
        
    }
    
    public String toString(){
        return name + " / " + this.total;
    }
}
