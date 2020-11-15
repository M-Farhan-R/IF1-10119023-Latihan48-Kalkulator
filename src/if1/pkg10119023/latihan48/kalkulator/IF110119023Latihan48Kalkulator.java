/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan48.kalkulator;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : programkal kulator
 *
 */
public class IF110119023Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        k.setValue1(7);
        k.setValue2(5);
        
        double v1 = k.getValue1();
        double v2 = k.getValue2();
        System.out.println("VALUE 1 = "+v1);
        System.out.println("VALUE 2 = "+v2);
        k.setNameProject();
        k.setNoteProject("This project show you how to manage method in java");
        System.out.println("Result Add is = "+k.add(v1, v2));
        System.out.println("Result Minnus = "+k.minus(v1, v2));
        System.out.println("Result Multiple = "+k.multiplication(v1, v2));
        System.out.println("Result Division = "+k.division(v1, v2));
        
        
        
    }

}
