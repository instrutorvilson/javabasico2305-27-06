/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revenda;

import java.time.LocalDate;

/**
 *
 * @author vilson.moro
 */
public class Carro {

    private String placa;
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private String cor;
    private int capacidadeTanque;
    private float kmLitro;

    public Carro() {
    }

    public Carro(String placa, String modelo, String marca, int anoFabricacao, String cor, int capacidadeTanque, float kmLitro) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
        this.kmLitro = kmLitro;
    }
    
    
    
    
    public float calcularAutonomia(){
        return capacidadeTanque * kmLitro;
    }
    
    public void setPlaca(String value){
        if(value.length() == 7 || value.length() == 8)
            placa = value;
        else
            System.out.println("Placa inválida");
                    
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        if(capacidadeTanque <= 0)
            System.out.println("Informe a capacidade do tanque");
        else
           this.capacidadeTanque = capacidadeTanque;
    }

    public float getKmLitro() {
        return kmLitro;
    }

    public void setKmLitro(float kmLitro) {
        if(kmLitro <= 0)
            System.out.println("Informe a km por litro");
        else
           this.kmLitro = kmLitro;
    }

    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - this.anoFabricacao;
    }
    public void display(){
        System.out.println("Placa........:  " + placa);
        System.out.println("Modelo.......:  " + modelo);
        System.out.println("Marca........:  " + marca);
        System.out.println("Ano Fab......:  " + anoFabricacao);
        System.out.println("Cor..........:  " + cor);
        System.out.println("Cap. Tanque..:  " + capacidadeTanque);
        System.out.println("Km Litro.....:  " + kmLitro);
        System.out.println(" ");
    }
    
}
