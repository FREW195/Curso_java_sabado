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
public class EJERCICIO_05 {
    public static void main(String[] args) {
        
        int numero=0;
        int suma=0;
        Scanner sp=new Scanner(System.in);
        do
        {
           System.out.println("Introduce un número: ");
           numero = sp.nextInt();
           suma=suma+numero;
           
           
        }while (numero !=0);
        System.out.println("La suma total es: "+ suma);
    }
}
