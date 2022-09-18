/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea_10_09_22;
import java.util.Scanner;

/**
 *
 * @author DRUMS
 */
public class TAREA_10_09_22 {

    public static void main(String[] args) {
        Scanner sp = new Scanner( System.in );
		
		 int num,cuadrado;
		
		 System.out.print("Introduzca número: ");
		 num=sp.nextInt();
                 
		 while(num>=0){ 
		 cuadrado=num*num;
		 System.out.println(num+ "² es igual a "+ cuadrado);
		 System.out.print("Introduzca otro número: ");
		 num=sp.nextInt();
		 } 
		 System.out.print("Fin.");
    }
}
