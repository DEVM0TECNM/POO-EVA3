/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_CAPTURA {

    public static void main(String[] args) {
        int x;
        do{
           try {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduzca un numero (entero): ");
            x = input.nextInt();
            break;
            } catch(InputMismatchException E){
                System.out.println("No se introdijo un valor valido, vuleva a capturar");
            }
        } while(true);
        System.out.println("Valor de x: " + x);
    }
}

