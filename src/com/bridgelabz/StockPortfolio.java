package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    Scanner sc = new Scanner(System.in);
    ArrayList<Stock> stockList = new ArrayList<>();

    public void addStock() {
        Stock stock = new Stock();
        System.out.println("Enter the name of the stock: ");
        stock.setStockName(sc.next());
        System.out.println("Enter the number of shares of stock");
        stock.setNumberOfStocks(sc.nextDouble());
        System.out.println("Enter the share Price of stock");
        stock.setSharePrice(sc.nextDouble());
        stockList.add(stock);
    }

    public void showStock() {
        System.out.println(stockList);
    }

    public Double getStockValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Stock: ");
        String stockName = scanner.next();
        for (Stock stock : stockList) {
            if (stock.getStockName().equals(stockName)) {
                double stockValue = stock.getNumberOfStocks() * stock.getSharePrice();
                return stockValue;
            }
        }
        return null;
    }
}
