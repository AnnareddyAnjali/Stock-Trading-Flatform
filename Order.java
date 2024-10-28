public class Order {
    public enum OrderType {
        BUY, SELL
    }

    private OrderType type;
    private String symbol;
    private int quantity;
    private double price;

    public Order(OrderType type, String symbol, int quantity, double price) {
        this.type = type;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderType getType() {
        return type;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
