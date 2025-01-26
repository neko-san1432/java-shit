/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author PC
 */
public class MyStack {
    public static int[] stack= new  int[20];
    private static int top = 1;
    private static int x;
    public String getStack(){
        String output = "Stack: ";
        if(top <= 1){
            output = "Empty";
        }else{
        for (int i = 0; i < top-1; i++) {
           output += stack[i]+ ", ";
           x++;
        }}  
        return output;
   }
    public void push(int element){
        if (top >= stack.length) {
            System.out.println("Overflow");
        }else{
        stack[top-1] = element;
        top++;
        }
    }
    public int pop(){
    if(top<=1){
        System.out.println("Underflow");
        return 0;
    }else{ 
        int n = stack [top -2];
        top--;
        return n;
    }
}
    public boolean isEmpty() {    
        return x==0;    
    }    
    public int getTop(){
       int n = stack[top-2];
       stack[top-2]=stack[top-2];
       return n;
    }
    public int getSize(){
        return x;
    }
}

