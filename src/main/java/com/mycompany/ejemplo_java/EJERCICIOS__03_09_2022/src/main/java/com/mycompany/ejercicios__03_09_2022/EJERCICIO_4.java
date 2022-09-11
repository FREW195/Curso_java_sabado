
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DRUMS
 */
public class EJERCICIO_4 {
    public static void main(String[] args) {
    Scanner sp = new Scanner(System.in);
    int a,b,c;
        System.out.println("Ingrese el primer número: ");
        a=sp.nextInt();
        System.out.println("Ingrese el segundo número: ");
        b=sp.nextInt();
        System.out.println("Ingrese el tercer número: ");
        c=sp.nextInt();
            
        System.out.println("Los números ordenados de mayor a menor son: ");
        if(a>=b && b>=c) {
            System.out.println(" " +a+ " " +b+ " " +c+ " ");
        }
        else if (a>=c && c>=b) {
            System.out.println(" " +a+ " " +c+ " " +b+ " ");
        }
        else if (a>=c && a>=c) {
            System.out.println("" +b+ " " +a+ " " +c+ " ");
        }
        else if (b>=c && c>=a) {
            System.out.println(" "+b+ " " +c+ " " +a+ " ");
        }
    else if (c>=a && a>=b) {
            System.out.println(" " +c+ " " +a+ " " +b+ " ");
              }
       
        else {
            System.out.println("" +c+ " " +b+ " " +a+ " " );
                 
        }
    }
    
}
