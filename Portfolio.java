import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<String, Integer> holdings;
    private double cash;

    public Portfolio(double initialCash) {
        holdings = new HashMap<>();
        this.cash = initialCash;
    }

    public double getCash() {
        return cash;
    }

    public void buyStock(String symbol, int quantity, double price) {
        double totalCost = quantity * price;
        if (cash >= totalCost) {
            cash -= totalCost;
            holdings.put(symbol, holdings.getOrDefault(symbol, 0) + quantity);
            System.out.println("Bought " + quantity + " shares of " + symbol);
        } else {
            System.out.println("Not enough cash to buy " + symbol);
        }
    }

    public void sellStock(String symbol, int quantity, double price) {
        int ownedQuantity = holdings.getOrDefault(symbol, 0);
        if (ownedQuantity >= quantity) {
            double totalProceeds = quantity * price;
            cash += totalProceeds;
            holdings.put(symbol, ownedQuantity - quantity);
            System.out.println("Sold " + quantity + " shares of " + symbol);
        } else {
            System.out.println("Not enough shares to sell " + symbol);
        }
    }

    public void displayPortfolio() {
        System.out.println("Cash: $" + cash);
        System.out.println("Holdings:");
        holdings.forEach((symbol, qty) -> System.out.println(symbol + ": " + qty + " shares"));
    }
}
