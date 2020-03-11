package com.company;

public class MainStudent {
    public static void main(String[] args) {

        Student student1= new Student();
        Student2 student2 = new Student2();
        Student3 student3= new Student3();

        student1.setName("Chen Chien chiou");
        student1.setStudyNumber("108021079");
        student1.setSCHOOL("ASIA University");
        student1.setGrade("1B");
        student1.setGender("BOY");
        student2.setName("Wong Meing Ling");
        student2.setStudyNumber("964596559655");
        student2.setSCHOOL("Europe University");
        student2.setGrade("9A");
        student2.setGender("Girl");

        student3.setName("Chirno");
        student3.setStudyNumber("68652476786");
        student3.setSCHOOL("Africa University");
        student3.setGrade("6E");
        student3.setGender("Dont tell ");

       // System.out.println(student1.getName());
      //  System.out.println(student1.getStudyNumber());
    //    System.out.println(student1.getSCHOOL());
    //    System.out.println(student1.getGrade());
     //   System.out.println(student1.getGender());
       System.out.println("Student1 for Chen Chien chiou ");
        student1.showInfo();
        System.out.println("Student2 for Wong Meing Ling ");
        student2.showInfo();
        System.out.println("Student3 for Chirno ");
        student3.showInfo();
    }
}




