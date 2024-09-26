package app;

import java.util.Locale;

public class SolutionHomeWork04 {

    public static void main(String[] args){


        int prodNumber = 1;
        String product = "smartphone";
        int numberOfDays = 5;
        double totalSales = 12153.41;
        double salesByDay = totalSales/numberOfDays;


        System.out.printf(Locale.FRANCE,"Product No %d: %s,\n" +
                "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n",prodNumber,product,numberOfDays,totalSales,salesByDay);

        prodNumber++;
        product = "laptop";
        numberOfDays = 7;
        totalSales = 10486.85;
        salesByDay =totalSales/numberOfDays;

        System.out.printf(Locale.FRANCE,"Product No %d: %s,\n" +
                "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n",prodNumber, product, numberOfDays, totalSales, salesByDay);

    }
}
