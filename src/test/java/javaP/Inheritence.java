package javaP;

public class Inheritence {
}

class animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}

class dog extends animal{
    @Override
    void sound(){
        System.out.println("Dog make sound");
    }

    void sound(String str){
        System.out.println("Dog make "+str);
    }
}
class cat extends dog{
    void eat(){
        System.out.println("Cat eats");
    }

    public static void main(String[] args) {
        cat mycat = new cat();
        mycat.sound("mew");
    }
}

