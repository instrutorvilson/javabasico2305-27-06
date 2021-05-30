/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forarray;

/**
 *
 * @author vilson.moro
 */
public class ForArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
        
        //for tradicional
        System.out.println("===================================");
        
        for(int i = 0; i < cars.length; i++ ){
            System.out.println(cars[i]);
        }
        System.out.println("===================================");
        for(int i = (cars.length -1); i >= 0; i-- ){
            System.out.println(cars[i]);
        }        
    }

}
