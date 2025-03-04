package javaPracticeQuestions;

public class MethodOverloadingNMethodOverridding {
    public static void main(String[] args) {
        animal mydog = new dog();
        animal mycat = new cat();
        animal myanimal = new animal();

        mydog.sound();
        myanimal.sound();
        mycat.sound();

    }
}
class animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}
//method overriding
class dog extends animal{
    @Override
    void sound(){
        System.out.println("Dog make sound");
    }
}

class cat extends animal{
    void sound(String catNoise){
        System.out.println("The cat noise is "+catNoise);
    }
}

