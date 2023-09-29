import java.util.ArrayList;

public class User extends Basket {
    private String login;
    private String password;

    public User(String login, String password, ArrayList<Products> purchasedProducts) {
        super(purchasedProducts);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    /**
     * @apiNote печатает продукты вместе с логином пользователя
     */
    @Override
    public void printBasketList() {
        System.out.println(getLogin());
        for (Products product : getPurchasedProducts()) {
            System.out.println(product.getNameProduct());
        }
    }
}
