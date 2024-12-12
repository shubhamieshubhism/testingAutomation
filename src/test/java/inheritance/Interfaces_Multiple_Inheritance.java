package inheritance;

import static org.checkerframework.checker.units.qual.Prefix.one;

class Interfaces_Multiple_Inheritance implements One,two{
    public void Interface_multiple_Inheritance_method(){
        System.out.println("Interface_multiple_Inheritance_method is now running");
    }

    public static void main(String[] args) {
        Interfaces_Multiple_Inheritance mp = new Interfaces_Multiple_Inheritance();
        mp.method_one();
        mp.method_two();
        mp.Interface_multiple_Inheritance_method();
    }

    @Override
    public void method_one() {
        One.super.method_one();
    }
}
