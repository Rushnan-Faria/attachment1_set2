package com.company;
import java.util.Scanner;
import java.lang.reflect.Array;

public class movie {
    Scanner scan=new Scanner(System.in);
    public static String[] movie = new String[100];
    public static String[] startDate = new String[100];
    public static String[] endDate = new String[100];
    public static float[] consumptionHour = new float[100];
    public static float[] rating = new float[100];
    public static float[] consumptionDay = new float[100];
    private static int i=0,j;
    public void addMovie(){
        System.out.println("Enter the book name:");
        movie[i]=scan.nextLine();
        System.out.println("Enter the start date in the format yyyy-mm-dd:");
        startDate[i]=scan.nextLine();
        System.out.println("Enter the end date in the format yyyy-mm-dd:");
        endDate[i]=scan.nextLine();
        System.out.println("Enter the consumption in hour:");
        consumptionHour[i]=scan.nextFloat();
        System.out.println("Enter your rating out of 10:");
        rating[i]=scan.nextFloat();
        System.out.println("Enter the total day of consumption:");
        consumptionDay[i]=scan.nextFloat();
        i++;
    }
    public void editM(int k){
        int newConHour=scan.nextInt();
        consumptionHour[k-1]=+newConHour;
        int newConDay=scan.nextInt();
        consumptionDay[k-1]=+newConDay;
        int newRat=scan.nextInt();
        Array.set(rating,k-1,newRat);
    }
    public void deleteM(int x){
        int k=x-1;
        for (int j = k; j<i-1; j++) {
            movie[j] = movie[j+1];
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
    public void displayM(){
       System.out.println("list of the movies:\n");
        for(j=0;j<i;j++) {
            int p=j+1;
            System.out.println(p+". "+movie[j] + "\t" + startDate[j] + "\t" + endDate[j] + "\t" + consumptionHour[j] + "\t" + rating[j] + "\t" + consumptionDay[j]);
        }
    }
}