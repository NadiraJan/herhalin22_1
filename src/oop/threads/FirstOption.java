package oop.threads;

public class FirstOption extends Thread{

    public void run(){
        System.out.println("This code is running in a thread");


    }
    public static void main(String[] args) {
        FirstOption thread = new FirstOption();
        thread.start();
        System.out.println("This code is outside of the thread");
    }


}

