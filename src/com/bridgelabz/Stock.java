package com.bridgelabz;

public class Stock {
    private String stockName;
    private double numberOfStocks;
    private double sharePrice;

    public Stock() {

    }

    public Stock(String stockName, double numberOfStocks, double sharePrice) {
        this.stockName = stockName;
        this.numberOfStocks = numberOfStocks;
        this.sharePrice = sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(double numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", numberOfStocks=" + numberOfStocks +
                ", sharePrice=" + sharePrice +
                '}';
    }
}
