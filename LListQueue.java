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
public class LListQueue {
    static int size = 0;
    static Node r;

    static void isEmpty() {
        if (size <= 0) {
            JOptionPane.showMessageDialog(null, "The queue is empty");
	   
        } else if(size> 0){
            JOptionPane.showMessageDialog(null, "The queue is not empty");
        }
    }

    static void enqueue(int x){
        Node ptr = new Node(x);
        ptr.link =r;
        r=ptr;
        size++;
    }
    static void dequeue(){     
	    if(size<=0){
		JOptionPane.showMessageDialog(null,"The queue is empty","ERROR",JOptionPane.ERROR_MESSAGE);
	}else{
	    Node deq;
            deq =r;
            r = deq.link;
            size--;
            JOptionPane.showMessageDialog(null,"Dequeued");}
        }
    }
    static void sizeA(){
        JOptionPane.showMessageDialog(null,"The size of the queue is "+size);
    }
    static void print(){
        String output = "Stack Element: ";
        Node tempPtr = r;

        while(tempPtr !=null){
            output += tempPtr.val + ", ";
            tempPtr = tempPtr.link;
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
