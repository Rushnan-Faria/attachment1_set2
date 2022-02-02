package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Select an option from below:\n1. Add a consumable,\n2. Edit a consumable,\n3. Delete a consumable,\n 4. See the list of consumables and individually\n5. See overall info");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        if (option == 1) {
            System.out.println("Now Select the type of consumable you want to add:\n1.Book,\n2.Series,\n3.Movie.");
            int category = scan.nextInt();
            if (category == 1) {
                book bkobj = new book();
                bkobj.addBook();
                bkobj.display();
            }
            if (category == 2) {
                series srobj = new series();
                srobj.test();
            }
            if (category == 3) {
                movie mvobj = new movie();
                mvobj.test();
            }
        }
    }
}
