package inheritance;

public class multipleInheritanceUsingInterfaces {
}
interface A{
    default void methodA(){
        System.out.println("Method A is executing");
    }
}

interface b{
    default void methodb(){
        System.out.println("Method B is executing");
    }

    public static void main(String[] args) {
        myClass obj = new myClass();
        obj.methodA();
        obj.methodb();
        obj.myMethod();
    }
}

