/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author asiri
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new mainForm().setVisible(true);
        
        
        
        
        

    }
    
    
    
    

   /* static boolean isConflicted(String[][] a, String[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (!a[i][j].trim().isEmpty() && !b[i][j].trim().isEmpty()) {
                    return true;

                }
            }
        }
        return false;
    }*/

    /*static ArrayList<String[][]> Combinations(ArrayList<String[][]> a, ArrayList<String[][]> b) {
        ArrayList<String[][]> possible = new ArrayList<>();
        for (int j = 0; j < a.size(); j++) {
            for (int i = 0; i < b.size(); i++) {
                if (!isConflicted(a.get(j), b.get(i))) {
                    possible.add(Add(a.get(j), b.get(i)));

                }
            }
        }

        return possible;
    }*/

    /*static String[][] Add(String[][] a, String[][] b) {
        String[][] newStr = new String[8][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                newStr[i][j] = a[i][j].concat(b[i][j]);

            }
        }
        return newStr;
    }

    
    static void showForm(ArrayList<String[][]> str){
        Form form = new Form(str);
        form.setVisible(true);
    }
*/
}
    
