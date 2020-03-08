

public class MainBook {
    public static void main(String[] args) {
        Book book1= new Book();
        Book book2 = new Book();
        Book book3= new Book();
        Book book4= new Book();
        Book book5= new Book();
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
    }
}

