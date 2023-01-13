package oop.interfaces;

public interface Animal {

    public void animalSound();
    public void sleep();
}

class Pig implements Animal{ //implements instead of EXTENDS LIKE IN ABSTRACT CLASS

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void sleep(){
        System.out.println("ZZZ");
    }
}
class App{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
