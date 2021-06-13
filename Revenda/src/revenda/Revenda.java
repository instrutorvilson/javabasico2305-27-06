/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revenda;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class Revenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Carro c1 = new Carro();
      c1.setPlaca("ABC-2453");
      c1.setAnoFabricacao(1980);
      c1.setMarca("Ford");
      c1.setCor("verde");
      c1.setModelo("Belina");
      c1.setCapacidadeTanque(40);
      c1.setKmLitro(10);
      c1.display();
          
      Carro c2 = new Carro("asd-2345", "Fusca", "volks", 1972, "vermelho", 40, 10);
      c2.display();
     
      Carro c3 = new Carro();
      System.out.println("Informe placa ");
      c3.setPlaca(new Scanner(System.in).next());
    }
    
}
