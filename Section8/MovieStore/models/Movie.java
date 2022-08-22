package models;

public class Movie {
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentingPrice;
    private boolean isAvailable;

    public Movie (String name, String format, double d) {
        if (name.isBlank() || name == null) {
            throw new IllegalArgumentException("name cannot be blank or null");
        } else if (!format.equalsIgnoreCase("DVD") || !format.equalsIgnoreCase("Blue-Ray")) {
            throw new IllegalArgumentException("format must be DVD or blue-ray");
        } else if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("INVALID RATING");
        }

        this.name = name;
        this.format = format;
        this.rating = d;

        this.sellingPrice = format.equals("Blue-Ray") ? 4.25 : 2.25;
        this.rentingPrice= format.equals("Blue-Ray") ? 1.99 : 0.99;

        isAvailable = true;
    }

    public Movie (Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;

        this.sellingPrice = source.sellingPrice;
        this.rentingPrice= source.rentingPrice;

        isAvailable = source.isAvailable;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getRentingPrice() {
        return rentingPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setFormat(String format) {
        this.format = format;
        if (format.equals("Blue-Ray")) {
            setSellingPrice(4.25);
            setRentingPrice(1.99);

        } else {
            setSellingPrice(2.25);
            setRentingPrice(0.99);
        }

        if (!format.equalsIgnoreCase("DVD") || !format.equalsIgnoreCase("Blue-Ray")) {
            throw new IllegalArgumentException("format must be DVD or blue-ray");
        }
    }

    public void setRating(int rating) {
        this.rating = rating;

        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("INVALID RATING");
        }
    }

    private void setRentingPrice(double rentingPrice) {
        this.rentingPrice = rentingPrice;
    }
    
    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String toString() {
            return 
            "\t Name: " + this.name + "\n" +
            "\t Format: " + this.format + "\n" +
            "\t Rating: " + this.rating + "\n" +
            "\t Selling Price: " + this.sellingPrice + "\n" +
            "\t Rental Price: " + this.rentingPrice + "\n" +
            "\t Availability: " + (this.isAvailable ? "in-stock" : "rented") + "\n";
}

}
