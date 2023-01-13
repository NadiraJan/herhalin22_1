package oop.interfaces.multipleInterfaces;

public interface FirstInterface {
    public void myMethod();
}
interface SecondInterface{
    public void myOtherMethod();
}
class DemoClass implements FirstInterface,SecondInterface{
    @Override
    public void myMethod() {
        System.out.println("Some text...");
    }
    public void myOtherMethod(){
        System.out.println("Some other text...");
    }
}
class App{
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}