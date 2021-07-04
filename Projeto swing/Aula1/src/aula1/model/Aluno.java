/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vilson.moro
 */
public class Aluno {
   private String nome;
   private float n1;
   private float n2;
   private float n3;
   private float frequencia;
   
   public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        if(isNotaValid(n1))
           this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }
   
    public float getMedia(){
        return (n1 + n2 + n3)/3;
    }
    
    public String getSituacao(){
        if((getMedia() < 7) || (frequencia < 75))
          return "reprovado";
        else
          return "aprovado";
    }
    
    private boolean isNotaValid(float nota) {
        return (nota >= 0) && (nota <= 10);
    }
}
