/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LList;

/**
 *
 * @author benjiepabroa
 */
public class LListStack {
    Node top;
    int size=0;
    
    public void push(int v){
        Node n = new Node(v);
        n.link = top;
        top = n;
        
    }
    
    public Node pop(){
        
        Node poppedElement = top;
        
        try{
            top = top.link;
        }catch(Exception e){
            System.out.println("STack is empty " + e.getMessage());
        }
        
        
        
        return poppedElement;
    }
    
    public int size(){
        
        int s = 0;
        Node tempPtr = top;
        
        while(tempPtr !=null){
            s++;
            tempPtr = tempPtr.link;
        }
        
        return s;
    }
    
    public String toString(){
        
        String output = "Stack Element: ";
        Node tempPtr = top;
        
        while(tempPtr !=null){
            output += tempPtr.val + ", ";
            tempPtr = tempPtr.link;
        }
        
        
        return output;
    }
    
    
}
