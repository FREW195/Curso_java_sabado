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
public class EJERCICIO_2 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        
        System.out.println("Escribe un número");
        double num = sp.nextDouble();
        
        if (num==0){
            System.out.println("El número es nuetro");
        } else if (num <0) {
            System.out.println("El número es negativo");
        } 
        else {
                System.out.println("El número es positivo");
              }
            
    }
    
}
