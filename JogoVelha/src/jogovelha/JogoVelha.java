/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelha;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class JogoVelha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] tabuleiro = new String[3][3];
        
        //setar valor padrão
        for(int linha=0; linha < tabuleiro.length;linha++){
            for(int coluna=0; coluna < tabuleiro.length; coluna++){
                tabuleiro[linha][coluna] = "";
            }
        }
        
        boolean jogar = true;
        while(jogar){
            System.out.println("Informe linha ");
            int linha = new Scanner(System.in).nextInt();
            
            System.out.println("Informe coluna ");
            int coluna = new Scanner(System.in).nextInt();
            
            if(tabuleiro[linha][coluna].equals("")){
              tabuleiro[linha][coluna] = "x";
            } 
            else
                System.out.println("Posição ja preenchida");  
            
            //teste de diagonal direita
            if( (tabuleiro[0][0] == "x")&&(tabuleiro[1][1]=="x")&&(tabuleiro[2][2]=="x")){
                System.out.println("X ganhou");
                jogar = false;
            }
            
            //teste de diagonal esquerda
            if( (tabuleiro[0][2] == "x")&&(tabuleiro[1][1]=="x")&&(tabuleiro[2][0]=="x")){
                System.out.println("X ganhou");
                jogar = false;
            }
            
            //teste horizontal linha 0
            if( (tabuleiro[0][0] == "x")&&(tabuleiro[0][1]=="x")&&(tabuleiro[0][2]=="x")){
                System.out.println("X ganhou");
                jogar = false;
            }
            //teste horizontal linha 1
            if( (tabuleiro[1][0] == "x")&&(tabuleiro[1][1]=="x")&&(tabuleiro[1][2]=="x")){
                System.out.println("X ganhou");
                jogar = false;
            }
            
            //teste horizontal linha 2
            if( (tabuleiro[2][0] == "x")&&(tabuleiro[2][1]=="x")&&(tabuleiro[2][2]=="x")){
                System.out.println("X ganhou");
                jogar = false;
            }
            
            //teste vertical coluna 0
            if( (tabuleiro[0][0] == "x")&&(tabuleiro[1][0]=="x")&&(tabuleiro[2][0]=="x")){
                System.out.println("X ganhou");
                jogar = false;
            }
            
            //teste vertical coluna 1
            if( (tabuleiro[0][1] == "x")&&(tabuleiro[1][1]=="x")&&(tabuleiro[2][1]=="x")){
                System.out.println("X ganhou");
                jogar = false;
            }
            
            //teste vertical coluna 2
            if( (tabuleiro[0][2] == "x")&&(tabuleiro[1][2]=="x")&&(tabuleiro[2][2]=="x")){
                System.out.println("X ganhou");
                jogar = false;
            }
        }
        
    }
    
}
