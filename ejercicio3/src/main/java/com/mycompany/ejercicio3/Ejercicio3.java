/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Ejercicio3 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();
        
        System.out.println("El doble de " + numero + " es: " + (numero * 2));
        System.out.println("El triple de " + numero + " es: " + (numero * 3));
    }
}
