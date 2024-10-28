
public class Main {
    public static void main(String[] args) {
        TradingPlatform platform = new TradingPlatform(10000.0);
        
        platform.displayMarketData();
        platform.buy("AAPL", 10);
        platform.sell("TSLA", 5);
        platform.displayPortfolio();
        
        // Use the new method to update the price
        platform.updateStockPrice("AAPL", 155.0);
        platform.buy("AAPL", 5);
        platform.displayPortfolio();
    }
}

