package com.company;
import java.util.Scanner;
import java.lang.reflect.Array;

public class book {
    Scanner scan=new Scanner(System.in);
    public static String[] books = new String[100];
    public static String[] startDate = new String[100];
    public static String[] endDate = new String[100];
    public static float[] consumptionHour = new float[100];
    public static float[] rating = new float[100];
    public static float[] consumptionDay = new float[100];
    public static float total_hour=0,total_day=0,rat=0;
    private static int count=0;
    public static int i=0;
    public void addBook(){
        System.out.println("Enter the book name:");
        books[i]=scan.nextLine();
        System.out.println("Enter the start date in the format yyyy-mm-dd:");
        startDate[i]=scan.nextLine();
        System.out.println("Enter the end date in the format yyyy-mm-dd:");
        endDate[i]=scan.nextLine();
        System.out.println("Enter the consumption in hour:");
        consumptionHour[i]=scan.nextFloat();
        total_hour=total_hour+consumptionHour[i];
        System.out.println("Enter your rating out of 10:");
        rating[i]=scan.nextFloat();
        rat=rat+rating[i];
        System.out.println("Enter the total day of consumption:");
        consumptionDay[i]=scan.nextFloat();
        total_day=total_day+consumptionDay[i];
        i++;
        count++;
    }
    public void editB(int k){
        System.out.println("add consumption in hour:");
        int newConHour=scan.nextInt();
        consumptionHour[k-1]=consumptionHour[k-1]+newConHour;
        total_hour=total_hour+newConHour;
        System.out.println("add consumption in day:");
        int newConDay=scan.nextInt();
        consumptionDay[k-1]=consumptionDay[k-1]+newConDay;
        total_day=total_day+newConDay;
        System.out.println("new rating:");
        int newRat=scan.nextInt();
        rat=rat-rating[k-1];
        Array.set(rating,k-1,newRat);
        rat=rat+newRat;
    }
    public void deleteB(int x){
        int k=x-1;
        rat=rat-rating[k];
        for (int j = k; j<i-1; j++) {
            books[j] = books[j+1];
        }
        for (int j = k; j<i-1; j++) {
            startDate[j] = startDate[j+1];
        }
        for (int j = k; j<i-1; j++) {
            endDate[j] = endDate[j+1];
        }
        for (int j = k; j<i-1; j++) {
            consumptionHour[j] = consumptionHour[j+1];
        }
        for (int j = k; j<i-1; j++) {
            rating[j] = rating[j+1];
        }
        for (int j = k; j<i-1; j++) {
            consumptionDay[j] = consumptionDay[j+1];
        }
        i--;
    }
    public void displayB(){
        System.out.println("list of the books:\n");
        for(int j=0;j<i;j++) {
            int p=j+1;
            System.out.println(p+". "+books[j] + "\t"  + consumptionHour[j] + "\t" + rating[j] + "\t" + consumptionDay[j]);
        }
    }
    public void show(int p){
        int id=p-1;
        System.out.println(books[id] + "\t" + startDate[id] + "\t" + endDate[id] + "\t" + consumptionHour[id] + "\t" + rating[id] + "\t" + consumptionDay[id]);

    }
}
