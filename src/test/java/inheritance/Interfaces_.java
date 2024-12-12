package inheritance;

public class Interfaces_ {
}

interface One {
    default void method_one(){
        System.out.println("This is the same method with same parameters");

    }
}

interface two {
    default void method_two(){
        System.out.println("method two is now running");
    }

    default void method_one(){
        System.out.println("method one is now running");
    }
}


