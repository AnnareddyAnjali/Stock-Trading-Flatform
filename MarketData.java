import java.util.HashMap;
import java.util.Map;

public class MarketData {
    private Map<String, Stock> stocks;

    public MarketData() {
        stocks = new HashMap<>();
        // Initialize with some stocks
        stocks.put("AAPL", new Stock("AAPL", 150.0));
        stocks.put("GOOGL", new Stock("GOOGL", 2800.0));
        stocks.put("TSLA", new Stock("TSLA", 700.0));
    }

    public Stock getStock(String symbol) {
        return stocks.get(symbol);
    }

    public void updateStockPrice(String symbol, double newPrice) {
        Stock stock = stocks.get(symbol);
        if (stock != null) {
            stock.setPrice(newPrice);
        }
    }

    public Map<String, Stock> getAllStocks() {
        return stocks;
    }
}
