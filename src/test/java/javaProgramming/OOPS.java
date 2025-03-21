package javaProgramming;

public class OOPS {


}

class animal{
    void makeSound(){
        System.out.println("Animal noise");
    }
}
class dog extends animal {
    void eat() {
        System.out.println("Dog eat");
    }

    @Override
    void makeSound() {
        System.out.println("Dog noise");
    }

}


interface vehicle{
    void start();
}

abstract class car implements vehicle{
    abstract void accelearator();
}

class sportcar extends car{
    public void start(){
        System.out.println("Car starts");
    }

    public void accelearator(){
        System.out.println("accelearated");
    }
}

class test{
    public static void main(String[] args) {
        vehicle mycar = new sportcar();
        mycar.start();

    }
}



