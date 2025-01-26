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
public class MyQueue {
    Object[] qAry = new Object[20];
    int front=0;
    int rear=0;
    
    public boolean enqueue(Object element){
        //implement circular queue
        if(rear==20){
            return false;
        }
        qAry[rear] = element;
        rear++;
        return true;
    }
    
    public Object dequeue(){
        if(front == rear){
            return null;
        }else{
            Object obj = qAry[front];
            qAry[front] = null;
            front ++;
            return obj;
            
        }
    }
    
    public String toString(){
        String s = "[";
        for(int i=front; i<= rear-1; i++){
            s += this.qAry[i];
            if(i!=rear-1){
                s+= ", ";
            }
        }
        s+= "]";
        return s;
    }
    
//    public int size(){
//        
//    }
//    
//    public boolean isEmpty(){
//        
//    }
    
//       public Object[] toArray(){
//           
//       }
}
