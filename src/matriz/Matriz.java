/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int [][] matriz;
        int tamColuna, tamLinhas, numero;
        System.out.print("Digite a quantidade de linhas: ");
        tamColuna = Integer.parseInt(sc.nextLine());
        System.out.print("Digite a quantidade de colunas: ");
        tamLinhas = Integer.parseInt(sc.nextLine());
        
        matriz = new int[tamColuna][tamLinhas];
        
        for (int i = 0; i < tamColuna; i++) {
            for (int j = 0; j < tamLinhas; j++) {
                matriz[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        
        for (int i = 0; i < tamColuna; i++) {
            for (int j = 0; j < tamLinhas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Digite um número da matriz: ");
        numero = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < tamColuna; i++) {
            for (int j = 0; j < tamLinhas; j++) {
                if(matriz[i][j]!= numero)
                    continue;
                System.out.println("Posicao: " +i+", "+j);
                //Numero acima
                if((i-1) >= 0)
                    System.out.println("Acima: "+matriz[i-1][j]);
                //Numero abaixo
                if((i+1) < tamColuna)
                    System.out.println("Abaixo: "+matriz[i+1][j]);
                //Numero a esquerda
                if ((j-1) >= 0) 
                    System.out.println("Esquerda: "+ matriz[i][j-1]);
                //Numero a direita
                if((j+1) < tamLinhas)
                    System.out.println("Direita: "+ matriz[i][j+1]);
            }
        }
    }
    
}
