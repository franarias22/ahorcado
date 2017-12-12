/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author kangu
 */

public class AhorcadoJuego {
    
    public static void main(String[] args) {
        
        System.out.println("¿Cuántas letras tiene su palabra?");
	Scanner tampalScan = new Scanner(System.in);
        int tampal = tampalScan.nextInt();
	Ahorcado A = new Ahorcado();
	A.reducirtamanio(tampal);

	//Repite el proceso de imprimir hasta que vida sea 0, posib sea 1 o 0.
	while(A.getVida() > 0 && A.getPosib() != 1 && A.getPosib() != 0){
            A.imprimir();
	}
	 
        //Dice cual es la palabra encontrada.
	if(A.getPosib() == 1)
            for(int i = 0; i < A.getCantidadD(); i++)
                if(A.getElemSoN(i) == true)
                    System.out.println("La palabra es " + A.getElemD(i));
        
	//No se encontro la palabra.
	if(A.getPosib() == 0)
            System.out.println("La palabra no se encuentra en el diccionario.");

	//El programa perdio.
	if(A.getVida() == 0)
            System.out.println("Has ganado el juego. ¡Felicidades!");
	
        System.out.println("Fin del juego.");
        
        System.out.println("Press ENTER to finish...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
}
