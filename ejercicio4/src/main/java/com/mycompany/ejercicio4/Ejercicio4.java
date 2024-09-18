/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de grados centigrados: ");
        double centigrados = scanner.nextDouble();
        
        double fahrenheit = 32 + (9.0 / 5.0) * centigrados;
        
        System.out.println(centigrados + " grados centigrados equivalen a " + fahrenheit + " grados Fahrenheit.");
    } 
}
