package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float total_consumptionHour,total_consumptionDay,avg_rating,total_number;
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
            if(option==4){
                System.out.println("Now Select the type:\n1.Book,\n2.Series,\n3.Movie.");
                int category = scan.nextInt();
                if(category==1) {
                    bkObj.displayB();
                    int id=scan.nextInt();
                    bkObj.show(id);

                }
                if (category==2) {
                    srObj.displayS();
                    int id=scan.nextInt();
                    srObj.show(id);
                }
                if (category==3) {
                    mvObj.displayM();
                    int id=scan.nextInt();
                    mvObj.show(id);
                }
            }
            if(option==5){
                    total_consumptionHour= bkObj.total_hour+ srObj.total_hour+ mvObj.total_hour;
                    total_consumptionDay= bkObj.total_day+ srObj.total_day+ mvObj.total_day;
                    avg_rating= (bkObj.avg_rat+ srObj.avg_rat+ mvObj.avg_rat)/3;
                    System.out.println("1.The total consumption in hour across all type: "+total_consumptionHour);
                    System.out.println("2.The total consumption in hour of book: "+bkObj.total_hour);
                    System.out.println("3.The total consumption in hour of series: "+srObj.total_hour);
                    System.out.println("4.The total consumption in hour of movie: "+mvObj.total_hour);
                    System.out.println("5.The total days of consumption across all type: "+total_consumptionDay);
                    System.out.println("6.The total days of consumption of book: "+bkObj.total_day);
                    System.out.println("7.The total days of consumption of series: "+srObj.total_day);
                    System.out.println("8.The total days of consumption of movie: "+mvObj.total_day);
                    System.out.println("9.Average rating across all types: "+avg_rating);
                    System.out.println("2.Average rating of book: "+bkObj.avg_rat);
                    System.out.println("3.Average rating of series: "+srObj.avg_rat);
                    System.out.println("4.Average rating of movie: "+mvObj.avg_rat);
                    total_number=bkObj.i+srObj.i+mvObj.i;
                    System.out.println("1.The total consumable across all type: "+total_number);
                    System.out.println("2.The total consumable of book: "+bkObj.i);
                    System.out.println("3.The total consumable of series: "+srObj.i);
                    System.out.println("4.The total consumable of movie: "+mvObj.i);
            }
            if (option == 0) {
                break;
            }
        }
    }
}
