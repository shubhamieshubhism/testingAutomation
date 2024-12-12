package com.com;

public class encapsulation extends animal{
    private String name;
    private int age;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null && !name.isEmpty()){
        this.name = name;}

        else{
            System.out.println("Invalid input");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        }else{
            System.out.println("Enter valid age");
        }
    }

    public static void main(String[] args) {
        encapsulation en = new encapsulation();
        en.setName("shubham");
        en.setAge(10);
        System.out.println("person name "+ en.getName());
        System.out.println("Person's age "+en.getAge());
    }
}
