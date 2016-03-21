package edu.tomer.ness;

public class Main {

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        for (int i = 0; i < 3; i++) {
            book.insertContact("Moe " + i, "Shmoe", "05050");
        }

        book.dispDetails(10);
        book.dispDetails("M");
        //book.dispAllContacts();
    }
}
