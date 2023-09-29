public class Products {
    private String nameProduct;
    private double cost;
    private double rating;

    public Products(String nameProduct, double cost, double rating) {
        this.nameProduct = nameProduct;
        this.cost = cost;
        this.rating = rating;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getCost() {
        return cost;
    }

    public double getRating() {
        return rating;
    }

}
