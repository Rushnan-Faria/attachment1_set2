package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float total_consumptionHour,total_consumptionDay,avg_rating;
        int total_number;
        while (true) {
            book bkObj = new book();
            series srObj = new series();
            movie mvObj = new movie();
            System.out.println("Select an option from below:\n1. Add a consumable,\n2. Edit a consumable,\n3. Delete a consumable,\n4. See the list of consumables and individually\n5. See overall info\n0. Quit");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            if (option == 1) {
                while (true) {
                    System.out.println("Now Select the type of consumable you want to add:\n0.Main menu\n1.Book,\n2.Series,\n3.Movie.");
                    int category = scan.nextInt();
                    if(category==0)
                        break;
                    if (category == 1) {
                            bkObj.addBook();
                    }
                    if (category == 2) {
                        srObj.addSeries();
                    }
                    if (category == 3) {
                        mvObj.addMovie();
                    }
                }
            }
            if (option == 2) {
                while (true) {
                    System.out.println("Now Select the type you want to edit:\n0.Main Menu\n1.Book,\n2.Series,\n3.Movie.");
                    int category = scan.nextInt();
                    if(category==0)
                        break;
                    if (category == 1) {
                        bkObj.displayB();
                        System.out.println("select the book number you want to edit:");
                        int id = scan.nextInt();
                        while (true) {
                            System.out.println("0.go back,\n1.add hours in hour consumption,\n2.add days in day consumption,\n3.change rating.");
                            if (bkObj.endDate[id - 1].isEmpty()) {
                                System.out.println("4.add end date");
                            }
                            int d = scan.nextInt();
                            if (d == 1) {
                                bkObj.editConHour(id);
                            }
                            if (d == 2) {
                                bkObj.editConDay(id);
                            }
                            if (d == 3) {
                                bkObj.editRat(id);
                            }
                            if (d == 4) {
                                if (bkObj.endDate[id - 1].isEmpty())
                                    bkObj.editEnd(id);
                            }
                            if (d == 0)
                                break;
                        }
                    }
                    if (category == 2) {
                        srObj.displayS();
                        System.out.println("select the series number you want to edit:");
                        int id = scan.nextInt();
                        while (true) {
                            System.out.println("0.go back,\n1.add hours in hour consumption,\n2.add days in day consumption,\n3.change rating.");
                            if (srObj.endDate[id - 1].isEmpty()) {
                                System.out.println("4.add end date");
                            }
                            int d = scan.nextInt();
                            if (d == 1) {
                                srObj.editConHour(id);
                            }
                            if (d == 2) {
                                srObj.editConDay(id);
                            }
                            if (d == 3) {
                                srObj.editRat(id);
                            }
                            if (d == 4) {
                                if (srObj.endDate[id - 1].isEmpty())
                                    srObj.editEnd(id);
                            }
                            if (d == 0)
                                break;
                        }
                    }
                    if (category == 3) {
                        mvObj.displayM();
                        System.out.println("select the movie number you want to edit:");
                        int id = scan.nextInt();
                        while (true) {
                            System.out.println("0.go back,\n1.add hours in hour consumption,\n2.add days in day consumption,\n3.change rating.");
                            if (mvObj.endDate[id - 1].isEmpty()) {
                                System.out.println("4.add end date");
                            }
                            int d = scan.nextInt();
                            if (d == 1) {
                                mvObj.editConHour(id);
                            }
                            if (d == 2) {
                                mvObj.editConDay(id);
                            }
                            if (d == 3) {
                                mvObj.editRat(id);
                            }
                            if (d == 4) {
                                if (mvObj.endDate[id - 1].isEmpty())
                                    mvObj.editEnd(id);
                            }
                            if (d == 0)
                                break;
                        }

                    }
                }
                }
            if (option == 3) {
                while (true) {
                    System.out.println("Now Select the type from you want to delete:\n0.Main Menu\n1.Book,\n2.Series,\n3.Movie.");
                    int category = scan.nextInt();
                    if (category==0)
                        break;
                    if (category == 1) {
                        while(true) {
                            bkObj.displayB();
                            System.out.println("select the book number you want to delete or 0 to go back:");
                            int id = scan.nextInt();
                            if(id==0)
                                break;
                            else {
                                bkObj.deleteB(id);
                                bkObj.displayB();
                            }
                        }
                    }
                    if (category == 2) {
                        srObj.displayS();
                        System.out.println("select the book number you want to delete or 0 to go back:");
                        int id = scan.nextInt();
                        if(id==0)
                            break;
                        else {
                            srObj.deleteS(id);
                            srObj.displayS();
                        }
                    }
                    if (category == 3) {
                        mvObj.displayM();
                        System.out.println("select the book number you want to delete or 0 to go back:");
                        int id = scan.nextInt();
                        if(id==0)
                            break;
                        else {
                            mvObj.deleteM(id);
                            mvObj.displayM();
                        }
                    }
                }
            }
            if(option==4){
                while (true) {
                    System.out.println("Now Select the type:\n0.Main Menu\n1.Book,\n2.Series,\n3.Movie.");
                    int category = scan.nextInt();
                    if (category==0)
                        break;
                    if (category == 1) {
                        while (true) {
                            bkObj.displayB();
                            System.out.println("enter 0 to go back or Select the book index to see details:");
                            int id = scan.nextInt();
                            if (id == 0)
                                break;
                            else
                                bkObj.show(id);
                        }

                    }
                    if (category == 2) {
                        while (true) {
                            srObj.displayS();
                            System.out.println("Enter 0 to go back or Select the series index to see details:");
                            int id = scan.nextInt();
                            if (id == 0)
                                break;
                            else
                                srObj.show(id);
                        }
                    }
                    if (category == 3) {
                        while (true) {
                            mvObj.displayM();
                            System.out.println("Enter 0 to go back or Select the movie index to see details:");
                            int id = scan.nextInt();
                            if (id == 0)
                                break;
                            else
                                mvObj.show(id);
                        }
                    }
                }
            }
            if(option==5){
                    total_consumptionHour= bkObj.total_hour+ srObj.total_hour+ mvObj.total_hour;
                    total_consumptionDay= bkObj.total_day+ srObj.total_day+ mvObj.total_day;
                    System.out.println("1.The total consumption in hour across all type: "+total_consumptionHour);
                    System.out.println("2.The total consumption in hour of book: "+bkObj.total_hour);
                    System.out.println("3.The total consumption in hour of series: "+srObj.total_hour);
                    System.out.println("4.The total consumption in hour of movie: "+mvObj.total_hour);
                    System.out.println("5.The total days of consumption across all type: "+total_consumptionDay);
                    System.out.println("6.The total days of consumption of book: "+bkObj.total_day);
                    System.out.println("7.The total days of consumption of series: "+srObj.total_day);
                    System.out.println("8.The total days of consumption of movie: "+mvObj.total_day);
                System.out.println(bkObj.rat);
                System.out.println(bkObj.i);
                    float avg_rat1=bkObj.rat/bkObj.i;
                    float avg_rat2=srObj.rat/srObj.i;
                    float avg_rat3=mvObj.rat/mvObj.i;
                    avg_rating= (avg_rat1+avg_rat2+avg_rat3)/3;
                    System.out.println("9.Average rating across all types: "+avg_rating);
                    System.out.println("2.Average rating of book: "+avg_rat1);
                    System.out.println("3.Average rating of series: "+avg_rat2);
                    System.out.println("4.Average rating of movie: "+avg_rat3);
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
