/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3d_array;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class 3dAryAct{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][] x = new int[3][2][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    x[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the score of quiz no. " + (k + 1) + " the subject " + (j + 1) + " for the student " + (i + 1) + ":"));
                }
            }
        }
        int init = 0,f=0;
        float[] r = new float[6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        init += x[i][j][k];
                    }
                    r[f] = (float)init / 2;
                    init = 0;
                    f++;
            }
        }


        String c = "";
        int w = 0;
        for (int i = 0; i < 3; i++) {
            c += "Student " + (i + 1) + "\n";
            c+="******************************************\n";
            c+="                       Quiz 1     Quiz 2     Avg\n";
            for (int j = 0; j < 2; j++) {
                c +="Subject "+(j+1)+"     "+ x[i][j][0] + "               " + x[i][j][1] + "              " + r[w];
                c += "\n";
                w++;
            }
            c += "******************************************\n\n";
        }
        JOptionPane.showMessageDialog(null, c);
    }
}

