package pt;

import org.apache.commons.collections4.map.HashedMap;
import org.codehaus.groovy.runtime.StringGroovyMethods;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeComparator {

    static class Student{
        private int age;
        private String name;

        public Student(String name,int age){

            this.name=name;
            this.age=age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Shubham", 24));
        studentList.add(new Student("Aman", 22));
        studentList.add(new Student("Ritika", 22));
        studentList.add(new Student("Raj", 21));
        studentList.add(new Student("Simran", 21));

        Map<String,Integer>studentMap =studentList.stream().collect(Collectors.toMap(Student::getName,Student::getAge));
        studentMap.forEach((name,age)-> System.out.println("Age --> "+ age+"  Name --> "+name));

        System.out.println("------------------------------------------------------------");

        List<Map.Entry<String,Integer>>list = new ArrayList<>(studentMap.entrySet());
        list.sort(Comparator.comparing(Map.Entry<String,Integer>::getValue).thenComparing(Map.Entry::getKey));

        for(Map.Entry<String,Integer> entry : list){
            System.out.println("Age --> "+entry.getValue()+" Name --> "+entry.getKey());
        }
    }
}
