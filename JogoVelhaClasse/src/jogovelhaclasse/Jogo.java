/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelhaclasse;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class Jogo {

    String[][] tabuleiro = new String[3][3];

    public void iniciar() {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                tabuleiro[linha][coluna] = "-";
            }
        }
    }

    public void listarTabuleiro() {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            System.out.println("");
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }
        }
        System.out.println("");
        System.out.println("==================================");
    }

    public boolean ganhou(Jogador jogador) {
        //teste de diagonal direita
        if ((tabuleiro[0][0].equals(jogador.letra))
                && (tabuleiro[1][1].equals(jogador.letra))
                && (tabuleiro[2][2].equals(jogador.letra))) {
            return true;
        }
        //teste horizontal linha 0
        if ((tabuleiro[0][0].equals(jogador.letra))
                && (tabuleiro[0][1].equals(jogador.letra))
                && (tabuleiro[0][2].equals(jogador.letra))) {            
            return true;
        }
        //teste vertical coluna 0
        if ((tabuleiro[0][0].equals(jogador.letra))
                && (tabuleiro[1][0].equals(jogador.letra))
                && (tabuleiro[2][0].equals(jogador.letra))) {
            return true;
        }

        //teste de diagonal esquerda       
        if ((tabuleiro[0][2].equals(jogador.letra))
                && (tabuleiro[1][1].equals(jogador.letra))
                && (tabuleiro[2][0].equals(jogador.letra))) {
            return true;
        }
        //teste vertical coluna 2
        if ((tabuleiro[0][2].equals(jogador.letra))
                && (tabuleiro[1][2].equals(jogador.letra))
                && (tabuleiro[2][2].equals(jogador.letra))) {
            return true;
        }

        //teste horizontal linha 1
        if ((tabuleiro[1][0].equals(jogador.letra))
                && (tabuleiro[1][1].equals(jogador.letra))
                && (tabuleiro[1][2].equals(jogador.letra))) {
            return true;
        }

        //teste horizontal linha 2
        if ((tabuleiro[2][0].equals(jogador.letra))
                && (tabuleiro[2][1].equals(jogador.letra))
                && (tabuleiro[2][2].equals(jogador.letra))) {
            return true;
        }

        //teste vertical coluna 1
        if ((tabuleiro[0][1].equals(jogador.letra))
                && (tabuleiro[1][1].equals(jogador.letra))
                && (tabuleiro[2][1].equals(jogador.letra))) {
            return true;
        }

        return false;
    }

    public boolean efetuarJogada(Jogador jogador) {
        int vezes = 0;
        do {
            System.out.println("Informe linha: ");
            int linha = new Scanner(System.in).nextInt();

            System.out.println("Informe coluna: ");
            int coluna = new Scanner(System.in).nextInt();

            if (posicaoVazia(linha, coluna)) {
                tabuleiro[linha][coluna] = jogador.letra;
                vezes = 1;
            } else {
                System.out.println("Posição preenchida. Jogue novamente " + jogador.nome);
                vezes = 0;
            }
        } while (vezes == 0);
        listarTabuleiro();
        return ganhou(jogador);
    }

    private boolean posicaoVazia(int linha, int coluna) {
        return tabuleiro[linha][coluna].equals("-");
    }

}
