/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadnsort;
import java.io.*;
import java.util.*;

/**
 *
 * @author GO_ICS103
 */
public class FileReadnSort {
    static Scanner z = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter file name:");
        String filename = z.next();
        String path = "D:\\test_path\\"+filename+".txt";
        try {
            File nums = new File(path);
            if (nums.createNewFile()) {
                System.out.println("File created: " + nums.getName()+"\n");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error creating the file");
            e.printStackTrace();
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Next process? (y/n)");
        String confirm = s.next();
        if (confirm.equals("y") || confirm.equals("Y")) {
            numIn(path);
        }else if (confirm.equals("n") || confirm.equals("N")){
            System.out.println("Goodbye");
            System.exit(0);
        }else{
            System.out.println("Wrong input, process terminated");
            System.exit(0);
        }
    }
    public static void numIn(String path){
        try {
            FileWriter ostream = new FileWriter(path);
            int w;
            for (int i = 0; i<6;i++){
                if (i == 0) {
                    System.out.println("1st number:");
                    w = z.nextInt();
                    ostream.write(w + "\n");
                } else if (i == 1) {
                    System.out.println("2nd number:");
                    w = z.nextInt();
                    ostream.write(w + "\n");
                } else if (i == 2) {
                    System.out.println("3rd number:");
                    w = z.nextInt();
                    ostream.write(w + "\n");
                } else if (i == 3) {
                    System.out.println("4th number:");
                    w = z.nextInt();
                    ostream.write(w + "\n");
                } else if (i == 4) {
                    System.out.println("5th number:");
                    w = z.nextInt();
                    ostream.write(w + "\n");
                } else {
                    System.out.println("6th number:");
                    w = z.nextInt();
                    ostream.write(w + "\n");
                }
            }
            ostream.close();

        } catch (IOException e) {
            System.err.println("Error opening file");
        } catch (InputMismatchException e) {
            System.err.println("Invalid data entry");
        }

        System.out.println("Process Success");
        System.out.println("Next process? (y/n)");
        String confirm = z.next();

        if (confirm.equals("y") || confirm.equals("Y")) {
            read(path);
        }else if (confirm.equals("n") || confirm.equals("N")){
            System.out.println("Goodbye");
            System.exit(0);
        }else{
            System.out.println("Wrong input, process terminated");
            System.exit(0);
        }
        z.close();
    }

    public static void read(String path){
        int [] numbers = new int[6];
        int i = 0;
        try {
            File read = new File(path);
            Scanner reads = new Scanner(read);

            while (reads.hasNextInt()){
                int store = reads.nextInt();
                numbers[i] = store;
                i++;
            }

            reads.close();
            sortnprint(numbers);
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
    public static void sortnprint(int [] nums){
        int tmp;
        for (int i = 0; i<nums.length;i++){
            for(int j =i+1; j<nums.length;j++){
                if(nums[i]<nums[j]){
                    tmp = nums[i];
                    nums[i]=nums[j];
                    nums[j] = tmp;
                }
            }
        }

        String y = "\nAscending: ";
        for(int i = 5; i>-1;i--) {
            if (i > 0) {
                y += nums[i] + ", ";
            } else{
                y += nums[i];
            }
        }
        System.out.println(y);

        String x = "Descending: ";
        for(int i = 0; i<nums.length;i++){
            if(i<=4) {
                x += nums[i] + ", ";
            }else{
                x += nums[i];
            }
        }
        System.out.println(x);
    }
}