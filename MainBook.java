

public class MainBook {
    public static void main(String[] args) {
       
        Book book1 = new Book();

         Book2 book2 = new Book2();

          Book3 book3= new Book3();

        book1.setName("King Author");
        book1.setAuthor("Jeff King");
        book1.setISBN("465465165486146846");
        book1.setPrice("199");
        book1.setpublishday("2020/2/29");


        book2.setName("Country Danger");
        book2.setAuthor("Meow Cat");
        book2.setISBN("1651651456351961515");
        book2.setPrice("999");
        book2.setpublishday("2020/1/19");



        book3.setName("Twithch_RainBow6 Life");
        book3.setAuthor("Twitch");
        book3.setISBN("145596494565156165");
        book3.setPrice("888");
        book3.setpublishday("2020/2/2");
       // System.out.println(book1.getName());
       // System.out.println(book1.getAuthor());
       // System.out.println(book1.getISBN());
       // System.out.println(book1.getPrice());
       // System.out.println(book1.getpublishday());
        System.out.println("Book1 for King Author ");
        book1.showInfo();
        System.out.println("Book2 for Country Danger ");
        book2.showInfo();
        System.out.println("Book3 for Twithch_RainBow6 Life ");
book3.showInfo();

    }
}

