package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            book bkObj = new book();
            series srObj = new series();
            movie mvObj = new movie();
            System.out.println("Select an option from below:\n1. Add a consumable,\n2. Edit a consumable,\n3. Delete a consumable,\n4. See the list of consumables and individually\n5. See overall info\n0. Quit");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            if (option == 1) {
                System.out.println("Now Select the type of consumable you want to add:\n1.Book,\n2.Series,\n3.Movie.");
                int category = scan.nextInt();
                if (category == 1) {
                    bkObj.addBook();
                    bkObj.displayB();
                }
                if (category == 2) {
                    srObj.addSeries();
                    srObj.displayS();
                }
                if (category == 3) {
                    mvObj.addMovie();
                    mvObj.displayM();
                }
            }
            if (option == 2) {
                System.out.println("Now Select the type you want to edit:\n1.Book,\n2.Series,\n3.Movie.");
                int category = scan.nextInt();
                if (category == 1) {
                    bkObj.displayB();
                    System.out.println("select the book number you want to edit:");
                    int id=scan.nextInt();
                    bkObj.editB(id);
                    bkObj.displayB();
                }
                if (category == 2) {
                    srObj.displayS();
                    System.out.println("select the series number you want to edit:");
                    int id=scan.nextInt();
                    srObj.editS(id);
                    srObj.displayS();
                }
                if (category == 3) {
                    mvObj.displayM();
                    System.out.println("select the movie number you want to edit:");
                    int id=scan.nextInt();
                    mvObj.editM(id);
                    mvObj.displayM();

                }
            }
            if (option == 3) {
                System.out.println("Now Select the type from you want to delete:\n1.Book,\n2.Series,\n3.Movie.");
                int category = scan.nextInt();
                if (category == 1) {
                    bkObj.displayB();
                    System.out.println("select the book number you want to delete:");
                    int id=scan.nextInt();
                    bkObj.deleteB(id);
                    bkObj.displayB();
                }
                if (category == 2) {
                    srObj.displayS();
                    System.out.println("select the book number you want to delete:");
                    int id=scan.nextInt();
                    srObj.deleteS(id);
                    srObj.displayS();
                }
                if (category == 3) {
                    mvObj.displayM();
                    System.out.println("select the book number you want to delete:");
                    int id=scan.nextInt();
                    mvObj.deleteM(id);
                    mvObj.displayM();
                }
            }
            if (option == 0) {
                break;
            }
        }
    }
}
