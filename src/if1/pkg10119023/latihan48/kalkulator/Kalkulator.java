/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan48.kalkulator;

/**
 *
 * @author Muhammad Farhan R 
 */
public class Kalkulator {
    private double value1,value2;
    
    public double getValue1(){
        return value1;
    }
    
    public void setValue1(double value1){
        this.value1 = value1;
    }
    
    public double getValue2(){
        return value2;
    }
    
    public void setValue2(double value2){
        this.value2 = value2;
    }
    
    public void setNameProject(){
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(String note){
        System.out.println("This project show you how to manage method in java");
    }
    
    public double add(double value1, double value2){
        double add = value1 + value2;
        return add;
    }
    
    public double minus(double value1, double value2){
        double minus = value1 - value2;
        return minus;
    }
    
    public double multiplication(double value1, double value2){
        double multiply = value1 * value2;
        return multiply;
    }
    
    public double division(double value1, double value2){
        double division = value1 / value2;
        return division;
    }
}
