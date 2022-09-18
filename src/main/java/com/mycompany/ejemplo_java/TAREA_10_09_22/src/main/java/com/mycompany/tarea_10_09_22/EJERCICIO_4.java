/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_10_09_22;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author DRUMS
 */
public class EJERCICIO_4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        int numerousuario;
        int adivinanza = ThreadLocalRandom.current(). nextInt(1,100);
        System.out.println("JUEGO DE ADIVINANZAS");
      
        do {
            System.out.println("Adivina el número: ");
            numerousuario = sr.nextInt();
            
            if (adivinanza>numerousuario){
            
            System.out.println("El número ingresado es muy bajo, intentalo de nuevo");
            }
        
            else if(adivinanza<numerousuario){
            System.out.println("El numero ingresa es muy alto, intentalo de nuevo");
            }
        } while(adivinanza != numerousuario);
          
            System.out.println("Adivinaste el número es: " +adivinanza);
    }
}
