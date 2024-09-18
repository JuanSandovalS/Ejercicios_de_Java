/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Ejercicio8 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un numero para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
