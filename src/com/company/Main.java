package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Select an option from below:\n1. Add a consumable,\n2. Edit a consumable,\n3. Delete a consumable,\n4. See the list of consumables and individually\n5. See overall info\n0. Quit");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        if (option == 1) {
            System.out.println("Now Select the type of consumable you want to add:\n1.Book,\n2.Series,\n3.Movie.");
            int category = scan.nextInt();
            if (category == 1) {
                book bkObj = new book();
                bkObj.addBook();
                bkObj.displayB();
                //System.out.println("want to add another book? type y/n.");
                //char decision = scan.next().charAt(0);
                //if(decision=='y'){
                  //  bkobj.addBook();
                 //   bkobj.display();
               // }
            }
            if (category == 2) {
                series srObj = new series();
                srObj.addSeries();
                srObj.displayS();
            }
            if (category == 3) {
                movie mvObj = new movie();
                mvObj.addMovie();
                mvObj.displayM();
            }
        }
        if (option==0){
            System.exit(0);
        }
    }
}
