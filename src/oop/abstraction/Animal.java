package oop.abstraction;

abstract class Animal {

    public abstract void animalSound();

    public void sleep(){
        System.out.println("zzzz");
    }

}

class Pig extends Animal{

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class App {
    public static void main(String[] args) {


        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}