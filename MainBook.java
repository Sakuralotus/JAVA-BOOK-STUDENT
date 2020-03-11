

public class MainBook {
    public static void main(String[] args) {
       
        Book book1= new Book();
        Book2 book2 = new Book2();
        Book3 book3= new Book3();
       
        book1.setName("King Author");
        book1.setAuthor("Author");
        book1.setISBN("465465165486146846");
        book1.setPrice("199");
        book1.setpublishday("2020/2/29");
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getISBN());
        System.out.println(book1.getPrice());
        System.out.println(book1.getpublishday());
        book1.showInfo();
book2.showInfo();
book3.showInfo();
    }
}

