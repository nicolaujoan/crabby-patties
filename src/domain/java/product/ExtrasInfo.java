package product;

public enum ExtrasInfo {
    CHEESE(0.25), SAUCE(0.50), MEDIUM(0.25), LARGE(0.50);

    // declaring private variable for getting values
    private Double price;

    // getter method
    public Double getPrice() {
        return this.price;
    }

    // enum constructor, cannot be public or protected
    ExtrasInfo(Double price) {
        this.price = price;
    }
}
