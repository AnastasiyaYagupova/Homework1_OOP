
import java.util.ArrayList;

public class Category {
    private String nameCategory;
    private ArrayList<Products> products;

    public Category(String nameCategory, ArrayList<Products> products) {
        this.nameCategory = nameCategory;
        this.products = products;
    }
    /**
     * @apiNote метод печатает определенуую категорию товаров
     */
    public void printArrayList() {
        System.out.println("-----Категория " + nameCategory + "-----");
        for (Products product : products) {
            System.out.println(
                            product.getNameProduct() +
                            ", цена " + product.getCost() +
                            ", рейтинг " + product.getRating());
        }
    }
    /**
     * @param basket
     * @return новый список категории
     * @apiNote Метод удаляет купленные товары
     */
    public ArrayList<Products> cleanArrayList(ArrayList<Products> basket) {
        products.removeAll(basket);
        return products;
    }

}

