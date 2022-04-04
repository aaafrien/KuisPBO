/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Main {
    public static void printAnimal(Animal hewan){
        System.out.print(hewan.getType() + " adalah " + hewan.getName() + " dengan bunyi ");
        hewan.makeSound();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal macan = new Macan("m1", "macan", "p");
        Animal macan1 = new Macan("m1", "macan", "pp");
        Animal kambing = new Kambing("k", "kambing", "k");
        Animal ayam = new Ayam("a", "ayam", "a");
        printAnimal(macan);
        printAnimal(macan1);
        printAnimal(kambing);
        printAnimal(ayam);
    }
}

// 123200093 - Afrien Khoirunnisa Shobar