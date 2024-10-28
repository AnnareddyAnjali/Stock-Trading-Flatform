public class TradingPlatform {
    private MarketData marketData;
    private Portfolio portfolio;

    public TradingPlatform(double initialCash) {
        marketData = new MarketData();
        portfolio = new Portfolio(initialCash);
    }

    public void buy(String symbol, int quantity) {
        Stock stock = marketData.getStock(symbol);
        if (stock != null) {
            portfolio.buyStock(symbol, quantity, stock.getPrice());
        } else {
            System.out.println("Stock " + symbol + " not found.");
        }
    }

    public void sell(String symbol, int quantity) {
        Stock stock = marketData.getStock(symbol);
        if (stock != null) {
            portfolio.sellStock(symbol, quantity, stock.getPrice());
        } else {
            System.out.println("Stock " + symbol + " not found.");
        }
    }

    public void updateStockPrice(String symbol, double newPrice) {
        marketData.updateStockPrice(symbol, newPrice);
    }

    public void displayMarketData() {
        System.out.println("Market Data:");
        marketData.getAllStocks().forEach((symbol, stock) ->
                System.out.println(stock));
    }

    public void displayPortfolio() {
        portfolio.displayPortfolio();
    }
}
