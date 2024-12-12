package com.com;

public class animal extends object_oriented_programming{
     private String input = "sometihing";
     private int a = 10;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void animal(String name){
        String s = name;
        System.out.println(name);
    }
    public void animalnoise(){
        System.out.println("animal noise");
    }
    public void sleep(){
        System.out.println("sleep");
    }


//    public static void main(String[] args) {
//        animal an = new animal();
//        an.animal("shubham");
//        an.animal(6,6);
////        object_oriented_programming oop = new object_oriented_programming();
////        oop.animal(5,5);
//    }
}
