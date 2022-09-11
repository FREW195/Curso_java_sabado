/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios__03_09_2022;
import java.util.Scanner;
/**
 *
 * @author DRUMS
 */
public class EJERCICIO_3 {
    public static void main(String[] args){
       Scanner sp = new Scanner(System.in);
       int num1,num2;
        System.out.println("Introduce un número: ");
        num1= sp.nextInt();
        System.out.println("Introduce otro número");
        num2= sp.nextInt();
        
        if (num1>num2) {
            System.out.println("Orden de mayor a menor:"+" "+num1+","+num2+".");
        }
        else {
            System.out.println("Orden de menor a mayor: "+" "+num2+","+num1+". ");
        }
               
     
    }
   
}
