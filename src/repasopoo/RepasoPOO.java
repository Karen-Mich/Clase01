/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasopoo;

/**
 *
 * @author DELL
 */
public class RepasoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var condicion = false;
        
        if(condicion){
            System.out.println("COndicion verdadera");
            System.out.println("nueva linea");
        }else {
            System.out.println("Condicion falsa");
        }
        
        var numero=2;
        var numeroTexto = "Numero desconocido";
        if(numero ==1){
           numeroTexto="Numero uno"; 
        }
        else if (numero==2){
            numeroTexto="Numero dos";
        }
        else if (numero==3){
            numeroTexto="Numero tres";
        }
        else if (numero==4){
            numeroTexto="Numero cuatro";
        }else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numero texto = "+ numeroTexto);
    }
    
}
