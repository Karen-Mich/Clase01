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
public class Estaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        var mes = Integer.parseInt(consola.nextLine());
        
        var estacion = "Estacion desconocida";
        
        if(mes == 1 || mes==2 || mes==12){
        estacion="Invierno";    
        }
        else if (mes==3 || mes==4||mes==5){
            estacion = "Primavera";
        }
        else if(mes ==6||mes==7||mes==8){
            estacion="Verano";
        }
        else if (mes ==9||mes==10||mes==11){
            estacion = "Otonio";
        }
        
        System.out.println("Estacion: "+estacion);
    }
    
}

