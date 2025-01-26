/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

/**
 *
 * @author benjiepabroa
 */
public class TableV2 {

    Pair index[];
    int currentIndex=0;
    int size;

    public static void main(String[] args) {
        TableV2 t = new TableV2(10);
        
        t.insert("rizal","blis", 102);
        t.insert("bench","bscs", 100);
        t.insert("andres","bsa", 103);
        t.insert("jose","bsit", 101);
        t.insert("john","bsit", 105);
        
        t.view();
    }
    
    TableV2() {
    }

    TableV2(int s) {
        size = s;
        index = new Pair[size];
    }
    public void insert(String val, String course, int key){
        
        Student newRecord = new Student(val, course, key);
        Pair p = new Pair();
        p.data = newRecord;
        p.key = key;
        this.index[currentIndex] = p;
        
        currentIndex++;
        sortIndex();
        
    }
    public void delete(int key) {
        int index1 = 0, i = 0;
        while (key != this.index[i].key) {
            index1++;
            i++;
        }
        for (int j = index1; j < this.index.length - 1; j++) {
            this.index[j] = this.index[j + 1];
        }
        size--;
        Pair[] index2 = new Pair[size];
        System.arraycopy(index, 0, index2, 0, size);
        index = new Pair[currentIndex];
        System.arraycopy(index2, 0, index, 0, size);

    }

    public void searchbyID(int ID) {
        int index = 0;
        for (int i = 0; this.index[i].key != ID && i < this.index.length; i++) {
            if (i == this.index.length - 1) {
                System.out.println("ID not found");
                index++;
                break;
            } else {
                index++;
            }

        }
        if (index != this.index.length) {
            Student s = this.index[index].data;
            System.out.println(s.id + " / " +
                    s.name + " / " + s.course);
        }
    }

    public void searchbyName(String name) {
        int index = 0;
        for (int i = 0; !Objects.equals(name, this.index[i].data.name) && i < this.index.length; i++) {
            if (i == this.index.length - 1) {
                System.out.println("Name not found");
                index++;
                break;
            } else {
                index++;
            }
        }
        if (index != this.index.length) {
            Student s = this.index[index].data;
            System.out.println(s.id + " / " +
                    s.name + " / " + s.course);
        }
    }
    private void sortIndex(){
        for (int i = 0; i < currentIndex; i++) {
            for (int j = 0; j < currentIndex; j++) {
                if(this.index[i].key<this.index[j].key){
                    Pair t = this.index[i];
                    this.index[i] = this.index[j];
                    this.index[j] = t;
                }
            }
        }
    }
    
    public void view(){
        for(int i =0; i<currentIndex;i++){
            Student s = this.index[i].data;
            System.out.println(s.id + " / " +
                    s.name + " / " + s.course);
        }
    }
}

class Pair{
    int key;
    Student data;
}

class Student{//internal class
    int id;
    String name;
    String course;
    
    public Student(String name, String course, int key){
        this.id = key;
        this.name = name;
        this.course = course;
    }
    
}
