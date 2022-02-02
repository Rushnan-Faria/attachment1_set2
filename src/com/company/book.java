package com.company;

import java.util.Scanner;

public class book {
    public String[] books = new String[100];
    public String[] startDate = new String[100];
    public String[] endDate = new String[100];
    public float[] consumptionHour = new float[100];
    public float[] rating = new float[100];
    public float[] consumptionDay = new float[100];
    private int i=0,j;
    public void addBook(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the book name:");
        books[i]=scan.nextLine();
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
    public void displayB(){
        for(j=0;j<i;j++)
        System.out.println(books[j]+"\t"+startDate[j]+"\t"+endDate[j]+"\t"+consumptionHour[j]+"\t"+rating[j]+"\t"+consumptionDay[j]);
    }
}
