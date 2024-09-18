/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Ejercicio1 {

    public static void main(String[] args) { 
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero entero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo numero entero: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Los números ingresados son: " + num1 + " y " + num2);
    }
}
