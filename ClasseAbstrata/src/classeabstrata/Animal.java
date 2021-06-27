/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeabstrata;

/**
 *
 * @author vilson.moro
 */
/*
  1-métodos abstratos não podem ser criados em classe concreta;
  2-métodos abstratos não podem tem corpo { implementaçaõ }
  3-classe abstrata pode ter método com implementaçaõ
 */
public abstract class Animal {

    String raca;

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }

}
