/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelhaclasse;

/**
 *
 * @author vilson.moro
 */
public class JogoVelhaClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Jogo jogo = new Jogo();
       jogo.iniciar();
       
       Jogador jogador1 = new Jogador("José","X");
       Jogador jogador2 = new Jogador("Pedro","O");
       
       boolean jogar = true;
       boolean ganhou = false;
        while(jogar){
           System.out.println(jogador1.nome + " sua vez de jogar");
           ganhou = jogo.efetuarJogada(jogador1); 
            
           if (!ganhou){
              System.out.println(jogador2.nome + " sua vez de jogar");           
              ganhou = jogo.efetuarJogada(jogador2);   
           } 
           jogar = !ganhou;
        }       
       
    }
    
}
