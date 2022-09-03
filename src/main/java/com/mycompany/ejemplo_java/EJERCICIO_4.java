/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;
import java.util.Scanner;
import java.util.*;

public class EJERCICIO_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce grados Centígrados: ");
        gradosC = sc.nextDouble();
        gradosF =  32 + (9 * gradosC / 5);
        System.out.println(gradosC + "°C = "+ gradosF + "°F");
    }
}
