/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasopoo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10: ");
        double valor = Integer.parseInt(consola.nextLine());
        
        
        if (valor>=9 && valor<=10){
            System.out.println("A");
        }
        else if (valor>=8 && valor<=9){
            System.out.println("B");
        }
        else if (valor>=7 && valor<=8){
            System.out.println("C");
        }
        else if (valor>=6 && valor<=7){
            System.out.println("D");
        }
        else if(valor>=0 && valor<=6){
        System.out.println("F");
    }
        else
            System.out.println("Valor desconocido");
        
        
    }
    
}
