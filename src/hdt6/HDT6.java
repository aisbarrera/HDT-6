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
 * @author andreabarrera
 */
public class HDT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
        int entrada = userInput();
    }
    
    
    public static void menu(){
		System.out.println("\n" + "***---***Bienvenido al programa para identificar desarrolladores**---***" + "\n\n");
		System.out.println("Escoja una implementacion:\n");
		System.out.println("1. HashSet\n");
		System.out.println("2. TreeSet\n");
		System.out.println("3. LinkedHashSet\n");
		System.out.println("Ingrese el numero de su eleccion:\n");
    }
    
    public static int userInput(){
		/**
		 * Scanner for user input.
		 */
		Scanner in = new Scanner(System.in);
		/**
		 * Variable to store user input.
		 */
		int entrada=0;
		try{
			entrada = in.nextInt();
		}
		catch(InputMismatchException e){
			JOptionPane.showMessageDialog(null, "Ingreso invalido", "ERROR", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		return entrada;
	}
}
