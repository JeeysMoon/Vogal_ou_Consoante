/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios_de_revisão_04_09;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Exercícios_de_Revisão_04_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /** Construa uma letra que mostre se é vogal ou consoante*/
       
       Scanner leitor = new Scanner(System.in);
       String letra = leitor.next();
       
       switch (letra) {
           case "a":
           case "e":
           case "i":
           case "o":
           case "u":
           case "A":
           case "E":
           case "I":
           case "O":
           case "U":    
               System.out.println("Vogal");
               break;
           default:
               System.out.println("Consoante");
                      
       }
       
    }
    
}
