/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QTest;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author benjiepabroa
 */
public class NewClass {
    public static void main(String[] args) {
        
        MyQueue q = new MyQueue();
        
//        Student s1 = new Student("111","Bench");
//        Student s2 = new Student("222","joy");
//        Student s3 = new Student("33","kris");
        Order s1 = new Order("bemch", 67.9);
        Order s2 = new Order("joy", 100.94);
        Order s3 = new Order("kris", 444.79);
        
        Queue q1 = new LinkedList();
        q1.offer(s1);
        q1.offer(s2);
        q1.offer(s3);
        
       
        Object[] objAry = q1.toArray();
        for(int i =0; i<objAry.length; i++){
            
            Order r = (Order)objAry[i];
            System.out.println("Name: " + r.name);
            System.out.println("total: " + r.total + "\n----");
        }
        
        int[] iobjAry= {1,2,3,4,5};
        for(int iobj:iobjAry){
            System.out.println(iobj);
        }
        
        
                
        
        
        
    }
}
