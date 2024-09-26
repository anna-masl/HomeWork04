package app;

import java.util.Locale;

public class SolutionHomeWork04 {

    public static void main(String[] args){


        int prodNumber = 1;
        String product = "smartphone";
        int numberOfDays = 5;
        int quantity = 5;
        double price =486.1364;
        double salesByDay = quantity*price;
        double totalSales = salesByDay*numberOfDays;



        System.out.printf(Locale.FRANCE,"Product No %d: %s,\n" +
                "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n",prodNumber,product,numberOfDays,totalSales,salesByDay);

        prodNumber++;
        product = "laptop";
        numberOfDays = 7;
        quantity = 3;
        price = 499.37381;
        salesByDay =quantity*price;
        totalSales = salesByDay*numberOfDays;


        System.out.printf(Locale.FRANCE,"Product No %d: %s,\n" +
                "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n",prodNumber, product, numberOfDays, totalSales, salesByDay);

    }
}
