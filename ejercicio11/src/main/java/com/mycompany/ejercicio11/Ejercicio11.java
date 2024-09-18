/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Ejercicio11 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        
        int contadorVocales = 0;
        String vocales = "aeiouAEIOU";
        
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (vocales.indexOf(letra) != -1) {
                contadorVocales++;
            }
        }
        
        System.out.println("El número de vocales en la cadena es: " + contadorVocales);
    }
}
