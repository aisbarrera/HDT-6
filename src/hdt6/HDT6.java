/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt6;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea Barrera/Santiago González
 */
public class HDT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n" + "***---***Bienvenido al programa para identificar desarrolladores**---***" + "\n\n");
        System.out.println("Elija la implementacion que utilizara: \n1.HashSet\n2.TreeSet\n3.LinkedHashSet ");
        Scanner s = new Scanner(System.in);
        String implem = s.next();
        SetC miSet = new SetC(implem);
        int x = 1;
       do{
        menu();
        String entrada = userInput();
        switch(entrada){
             case "1":
                  String nom = Programador();
                  String tipo = tipo();
                  miSet.add(nom,tipo);
                  otroTipo(nom, miSet);
                  otroTipo(nom, miSet);
                  break;
              case "2":
                 System.out.println("\n"+miSet.Preguntas()+"\n");
                  break;
              case "3":
                  System.out.println("Gracias por utilizar el sistema");
                  x = 3;
                  break;
        }  
    }while(x != 3);
    }
    
    
    public static void menu(){
	System.out.println("Eliga el numero de la accion que desea realizar");
	System.out.println("    1.Ingresar un programador");
	System.out.println("    2.Respuesta a preguntas");
	System.out.println("    3.Salir");
    }
    
    
    public static String Programador(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el nombre del progrmador");
        String nom = s.next();
        return nom;
    }
    public static String tipo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la letra de la especialidad:\nEspecialidades:\n    a) Java\n    b) Web\n    c)Celular");
        String tipo = s.next();
        return tipo;
    }
    
    public static void otroTipo(String nom, SetC miSet){
        Scanner s = new Scanner(System.in);
        System.out.println("¿Desea agregar otra especialidad?\n(si,no)");
        String ans = s.next();
        switch(ans){
            case "si":
                String ot = tipo();
                miSet.add(nom, ot);
                break;
            case "no":
                break;
        }
    }
    
    public static String userInput(){
		/**
		 * Scanner for user input.
		 */
		Scanner in = new Scanner(System.in);
		/**
		 * Variable to store user input.
		 */
		String entrada = "";
		try{
			entrada = in.next();
		}
		catch(InputMismatchException e){
			JOptionPane.showMessageDialog(null, "Ingreso invalido", "ERROR", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		return entrada;
	}
}
