package com.com;

public class inheritence extends animal{
    public void dog(){

        System.out.println("dog barks");
        System.out.println(super.getInput());
        System.out.println(super.getA());
    }
    public void updateValues(int number,String name){
        super.setA(number);
        super.setInput(name);
        System.out.println(super.getA());
        System.out.println(super.getInput());
    }

    public void eat(){
        System.out.println("Dog eats");
    }

    public static void main(String[] args) {
        inheritence en = new inheritence();

        en.dog();
        en.updateValues(20,"shubham");



    }
}
