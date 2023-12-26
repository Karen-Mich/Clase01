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
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        var mes =Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        
        switch(mes){
            case 1: case 2: case 12:
            estacion="Invierno";
            break;
            case 3: case 4: case 5:
                estacion="Primavera";
                break;
            case 6: case 7: case 8:
                estacion="Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
            default:
                estacion="Caso no encontrado";       
        }
        System.out.println("Estacion: "+estacion);
        
//        switch(numero){
//            case 1:
//                numeroTexto="Numero uno";
//                break;
//            case 2:
//                numeroTexto="Numero dos";
//                break;
//            case 3:
//                numeroTexto="Numero Tres";
//                break;
//            case 4:
//                numeroTexto="Numero Cuatro";
//                break;
//            default:
//                numeroTexto="Caso no encontrado";
//        }
//        System.out.println("Numero Texto: "+numeroTexto);
//    }
    
}
}
