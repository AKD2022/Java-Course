public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName (String name) {
        return this.name;
    }

    public double getPrice (double price) {
        return this.price;
    }

    public int getQuantity (int quantity) {
        return this.quantity;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public Item (Item source) {
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }
}
