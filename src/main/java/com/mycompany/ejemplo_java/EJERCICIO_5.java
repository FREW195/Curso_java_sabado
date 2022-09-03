/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author DRUMS
 */
public class EJERCICIO_5 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        double radio, longitud, area;
        System.out.println("Introduce radio de la circunferencia: ");
        radio= sc.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("Longitud de la circunferencia -> " + longitud);
        System.out.println("Area de la circunferencia -> " + area);
               
    }
}
