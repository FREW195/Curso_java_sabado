/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_10_09_22;

import java.util.Scanner;

/**
 *
 * @author DRUMS
 */
public class EJERCICIO_03 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
    
        int num;
        System.out.println("Ingrese un número");
        num=sp.nextInt();
        
            while (num !=0){
            if (num % 2 == 0){
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
                System.out.println("Ingrese un número");
                num=sp.nextInt();
        }
            System.out.println("Fin");
    }
    
    
}
