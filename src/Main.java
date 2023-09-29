import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Products product1 = new Products("Домик в деревне", 70, 4.7);
        Products product2 = new Products("Простоквашино", 85, 4.9);
        Products product3 = new Products("ВкусВилл", 100, 4.9);
        Products product4 = new Products("Сникерс", 50, 4.8);
        Products product5 = new Products("Марс", 40, 4.5);
        Products product6 = new Products("Пикник", 70, 4.9);

        ArrayList<Products> categoryList1 = new ArrayList<>();
        categoryList1.add(product1);
        categoryList1.add(product2);
        categoryList1.add(product3);
        Category category1 = new Category("Сметана", categoryList1);

        ArrayList<Products> categoryList2 = new ArrayList<>();
        categoryList2.add(product4);
        categoryList2.add(product5);
        categoryList2.add(product6);
        Category category2 = new Category("Батончики", categoryList2);
        System.out.println("Каталог продуктов");
        category1.printArrayList();
        category2.printArrayList();

        ArrayList<Products> basket1 = new ArrayList<>();
        basket1.add(product2);
        User user1 = new User("user1", "123", basket1);

        ArrayList<Products> basket2 = new ArrayList<>();
        basket2.add(product6);
        User user2 = new User("user2", "456", basket2);

        user1.printBasketList();
        user2.printBasketList();
        category1.cleanArrayList(basket1);
        category2.cleanArrayList(basket1);
        category1.cleanArrayList(basket2);
        category2.cleanArrayList(basket2);

        System.out.println("Каталог продуктов");
        category1.printArrayList();
        category2.printArrayList();
    }
}