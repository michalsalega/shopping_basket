package com.michalek;


public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket myBasket = new Basket("Tim");
        sellItem(myBasket, "car", 1);

        sellItem(myBasket, "car", 1);

        sellItem(myBasket, "spanner", 5);

        sellItem(myBasket, "juice", 4);
        sellItem(myBasket, "cup", 12);
        sellItem(myBasket, "bread", 1);
        sellItem(myBasket, "cup", -4);
        sellItem(myBasket, "cup", -10);
        sellItem(myBasket, "door", -1);
        sellItem(myBasket, "cup", 200);

        System.out.println(myBasket);

        Basket anotherBasket = new Basket("Mine");
        sellItem(anotherBasket, "door", 4);
        sellItem(anotherBasket, "phone", 1);
        sellItem(anotherBasket, "car", 1);
        sellItem(anotherBasket, "vase", 2);
        sellItem(anotherBasket, "cake", 3);

        System.out.println(anotherBasket);

        anotherBasket.checkout();
        anotherBasket.checkout();

        System.out.println(stockList);

        System.out.println(anotherBasket);
        System.out.println(anotherBasket);

        sellItem(anotherBasket, "door", 4);
        sellItem(anotherBasket, "phone", 1);
        sellItem(anotherBasket, "car", 1);
        sellItem(anotherBasket, "vase", 2);
        sellItem(anotherBasket, "cake", 3);

        System.out.println(anotherBasket);


    }

    private static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        basket.addToBasket(stockItem, quantity);
        return 1;

    }
}
