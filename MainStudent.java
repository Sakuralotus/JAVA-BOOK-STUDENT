package com.company;

public class MainStudent {
    public static void main(String[] args) {
        Student student1= new Student();
        Student student2 = new Student();
        Student student3= new Student();
        Student student4= new Student();
        Student student5= new Student();
        student1.setName("Chen Chien chiou");
        student1.setStudyNumber("108021079");
        student1.setSCHOOL("ASIA University");
        student1.setGrade("1B");
        student1.setGender("BOY");
        System.out.println(student1.getName());
        System.out.println(student1.getStudyNumber());
        System.out.println(student1.getSCHOOL());
        System.out.println(student1.getGrade());
        System.out.println(student1.getGender());
        student1.showInfo();
    }
}

