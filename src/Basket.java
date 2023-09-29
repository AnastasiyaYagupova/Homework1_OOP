import java.util.ArrayList;

public class Basket {
    private ArrayList<Products> purchasedProducts;

    public Basket(ArrayList<Products> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public ArrayList<Products> getPurchasedProducts() {
        return purchasedProducts;
    }

    /**
     * @apiNote печатает продукты
     */
    public void printBasketList(){
        for(Products product:purchasedProducts){
            System.out.println(product.getNameProduct());
        }
    }
}
