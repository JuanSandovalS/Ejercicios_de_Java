/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Ejercicio10 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            mayor = numero;  // El último número ingresado será el mayor
        }
        
        System.out.println("El ultimo numero ingresado es el mayor: " + mayor);
    }
}
