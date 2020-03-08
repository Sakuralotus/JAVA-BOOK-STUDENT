package com.company;

public class Book {
    private String name, author, ISBN ;
    private String Price;
    private String publishday;

    public Book() {
    }


    public void Book() {
        System.out.println("Book object has created");


    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setAuthor(String newAuthor) {

        this.author = newAuthor;
    }

    public Object getAuthor() {
        return this.author;
    }


    public void setISBN(String newISBN) {
        this.ISBN = newISBN;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setPrice(String newPrice) {
        this.Price = newPrice;
    }

    public String getPrice() {
        return this.Price;
    }

    public void setpublishday(String newPublishday) {
        this.publishday = newPublishday;
    }

    public String getpublishday() {
        return  this.publishday;
    }
    public void openbook(){

    }
    public void closebook(){

    }
    public void attackbook(){

    }
    public void showInfo(){
        System.out.println("Book Name:"+this.name+","+"Author Name: "+this.author+","+"ISBN Code:"+this.ISBN+","+"Price:"+this.Price+","+"Publish Day:"+this.publishday );
    }
}
