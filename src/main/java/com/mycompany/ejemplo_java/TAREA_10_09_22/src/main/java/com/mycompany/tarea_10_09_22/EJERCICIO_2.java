
package com.mycompany.tarea_10_09_22;
import java.util.Scanner;


public class EJERCICIO_2 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
    
        int num;
        System.out.println("Ingrese un número");
        num=sp.nextInt();
        
            while (num !=0){
            if (num>0){
                System.out.println("El número es positivo");
            } else {
                System.out.println("El número es negativo");
            }
                System.out.println("Ingrese un número");
                num=sp.nextInt();
        }
            System.out.println("Fin");
    }
    
    
}
