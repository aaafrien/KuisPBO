/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Ayam implements Animal {
    String animalName, type, sound;

    public Ayam(String type, String animalName, String sound) {
        this.sound = sound;
        this.animalName = animalName;
        this.type = type;
    }

    @Override
    public String getName(){
        return animalName;
    }
    
    @Override
    public String getType() {
        return type;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }
}
