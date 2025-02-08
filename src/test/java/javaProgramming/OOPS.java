package javaProgramming;

public class OOPS {


}

class animal{
    void makeSound(){
        System.out.println("Animal noise");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("Dog eat");
    }

    @Override
    void makeSound(){
        System.out.println("Dog noise");
    }


    public static void main(String[] args) {
        dog mydog = new dog();
        mydog.makeSound();
        mydog.eat();
    }
}
