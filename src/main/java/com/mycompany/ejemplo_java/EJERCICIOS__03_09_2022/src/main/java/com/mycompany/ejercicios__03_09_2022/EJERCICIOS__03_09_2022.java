/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicios__03_09_2022;

import java.util.Scanner;

/**
 *
 * @author DRUMS
 */
public class EJERCICIOS__03_09_2022 {

    public static void main(String[] args) {
       Scanner sp = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese un número");
        num1=sp.nextInt();
        System.out.println("Ingrese otro número");
        num2=sp.nextInt();
       
       if (num1==num2) {
            System.out.println("Son iguales");
       }
       else {
            System.out.println("No son iguales");
               }
    }
}
