package encapsulation;

public class Library {
    public static void main(String[] args) {
        Book political = new Book("Political", 600);
        Book technical = new Book("Technical", 700);
        Book medical = new Book("Medical", 1600);
        Book cleanCode = new Book("Clean code", 2600);
        Book[] library = new Book[4];

        library[0] = political;
        library[1] = technical;
        library[2] = medical;
        library[3] = cleanCode;

        for (Book book : library) {
            System.out.println(book.getName() + " - " + book.getPages());
        }

        library[0] = library[3];
        library[3] = political;

        for (Book book : library) {
            System.out.println(book.getName() + " - " + book.getPages());
        }

        for (Book book : library) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
