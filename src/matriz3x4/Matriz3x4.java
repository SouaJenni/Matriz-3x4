/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz3x4;

import java.util.Scanner;

/**
 *
 * @author Daniel Dória
 */
public class Matriz3x4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int [3][4];
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite 12 números: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nSua matriz: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println( );
        }
        
        scanner.close(); //isso fecha o scanner
    }
    
}
