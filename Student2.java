package com.company;

public class Student2 {
    private String name, StudyNumber,SCHOOL ;
    private String Grade;
    private String Gender;

    public Student2() {
    }




    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setStudyNumber(String newStudyNumber) {

        this.StudyNumber = newStudyNumber;
    }

    public Object getStudyNumber() {
        return this.StudyNumber;
    }


    public void setSCHOOL(String newSCHOOL) {
        this.SCHOOL = newSCHOOL;
    }

    public String getSCHOOL() {
        return this.SCHOOL;
    }

    public void setGrade(String newGrade) {
        this.Grade = newGrade;
    }

    public String getGrade() {
        return this.Grade;
    }

    public void setGender(String newGender) {
        this.Gender = newGender;
    }

    public String getGender() {
        return  this.Gender;
    }
    public void Study(){

    }
    public void Sleep(){

    }
    public void Eat(){

    }
    public void showInfo(){
        System.out.println("Student Name:"+this.name+","+"Study Number : "+this.StudyNumber+","+"Study School:"+this.SCHOOL+","+"Grade:"+this.Grade+","+"Gender:"+this.Gender );
    }
}