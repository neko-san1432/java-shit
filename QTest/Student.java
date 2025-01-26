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
public class Student {
    String id;
    String name;
    
    public Student(String xid, String xname){
        this.id = xid;
        this.name = xname;
    }
    public String toString(){
        return this.id + "/" + this.name;
    }
}
