import model.Customer;
import service.ShopManagerService;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer("петя", 17);
    ShopManagerService shopManagerService = new ShopManagerService();
    shopManagerService.inputProducts(customer);
    System.out.println("Ваша корзина " + customer.getBasket());
  }
}