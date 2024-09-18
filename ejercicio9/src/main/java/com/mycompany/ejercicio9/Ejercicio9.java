/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Ejercicio9 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }
        
        double promedio = suma / 10.0;
        System.out.println("El promedio de los 10 numeros es: " + promedio);
    } 
}
