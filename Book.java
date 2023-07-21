class Book {
static	String title;
 static       String author ;
 static       int publicationYear;
static String genre;
 static       double price ;
static boolean isAvailable;
    public static void main(String[] args) {
    /* String  title = "To Kill a Mockingbird";
     String    author = "Harper Lee";
    int   publicationYear = 1960;
     String    genre = "Fiction";
    double     price = 14.99;
    boolean isAvailable = true;*/
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Publication year: " + publicationYear);
        System.out.println("Book genre: " + genre);
        System.out.println("Book price: $" + price);
		System.out.println("Book is available: "+isAvailable);
    }
}
