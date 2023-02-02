package com.bridgelabz;

import java.util.Scanner;

public class StockOperation {
    public static void main(String[] args) {
        StockPortfolio stockPortfolio1 =new StockPortfolio();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many stocks ");
        stockPortfolio1.addStock();
        stockPortfolio1.addStock();
        stockPortfolio1.addStock();

        StockPortfolio stockPortfolio2 =new StockPortfolio();
        stockPortfolio2.addStock();
        stockPortfolio2.addStock();
        stockPortfolio2.addStock();

        stockPortfolio1.showStock();
        Double stockValue=stockPortfolio1.getStockValue();
        if(stockValue != null){
            System.out.println("Value of the Stock is: " +stockValue);
        }else {
            System.out.println("Stock not found");
        }
    }
}
