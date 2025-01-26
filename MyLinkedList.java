/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Student
 */
public class MyLinkedList{
    Node head;
    Node tail;
    int size =0;
    public Object[] toArray(){//convert list to array
        Object[] objs = new Object[size];
        
        Node tmp = head;
        int index=0;
        while(tmp!=null){
            objs[index] = tmp.obj;
            tmp = tmp.link;
            index++;
        }
        
        return objs;
    }
    
    public void addLast(Object o){//adds element at the end of the list
        Node newNode = new Node();
        newNode.obj = o;
        if(tail==null){
            head = newNode;
        }else{
            tail.link = newNode;
        }
        tail = newNode;
        size++;
    }
    public void addFirst(Object o){//insert new element at the beginning of the list
        Node newNode = new Node();
        newNode.obj = o;
        newNode.link = head;
        if(head == null){
            tail = newNode;
        }
        head = newNode;
        size++;
    }
    
    public void clear(){//remove all elements
        head = null;
    }
    
    public boolean contains(Object o){//returns TRUE if the element exists else FALSE
        Node tmp = head;
        while (tmp != null){
            if(tmp.obj == o ){
                return true;
            }else{
                tmp=tmp.link;
            }
        }
        return false;
    }
    
    public Object get(int index){//get element at the specific index
        Node tmp = head;
        int i=0;
        Object x="";
        try {
            for (int j = 0;tmp != null &&j<index;j++){
                tmp=tmp.link;
            }
            x=tmp.obj;
        }catch (NullPointerException e){
            System.out.println("The index your looking for has a null value");
        }
        return x;
    }
    
    public Object getFirst(){//return the first element and dont remove it
        return head.obj;
    }
    
    public Object getLast(){//return the last element and dont remove it

        Node tmp = head;
        Object r="";
        for (int j = 0;tmp != null &&j<size-1;j++) {
            tmp = tmp.link;
        }
        r = tmp.obj;
        return r;
    }
       
    public int size(){//get the number of objects in the list
        return size;
    }
    
    public Object removeFirst(){//removes the head
        size--;
        return head.link = head.link.link;
    }
    
    public Object removeLast(){//removes the last element
        Node tmp = head;
        Object o = null;
        while(tmp!=null){
            if(tmp.link==tail){
                o = tail.obj;
                tail = tmp;
                tail.link = null;
                break;
            }
            tmp = tmp.link;
        }
        size--;
        return o;
    }
}

class Node{
    Object obj;
    Node link;
}
