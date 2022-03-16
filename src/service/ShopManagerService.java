package service;

import java.util.Scanner;
import model.Basket;
import model.Customer;
import model.product.ProductsToys;
import model.product.ToyType;

public class ShopManagerService {
  /**
   * Позволяет добавить товары в корзину по средствам консоли
   */
  public void inputProducts(Customer customer) {
    System.out.println("Добро пожаловать в магазин");
    System.out.println("Выберите пункт меню:");
    System.out.println("1 - Добавить товар");
    System.out.println("2 - Закончить");

    Scanner scanner = new Scanner(System.in);
    int selected = scanner.nextInt();
    if (selected == 1) {
      inputProduct(customer.getBasket());
    } else if (selected == 2) {
      System.out.println("Ваша корзина" + customer.getBasket());
    } else {
      System.out.println("Данного пункта не существует");
    }
    scanner.close();
  }

  private void inputProduct(Basket basket) {
    System.out.println("Выберите категорию:");
    System.out.println(ToyType.CAR.getCode() + " - " + ToyType.CAR.name());
    System.out.println(ToyType.DOLL.getCode() + " - " + ToyType.DOLL.name());
    System.out.println(ToyType.PUZZLE.getCode() + " - " + ToyType.PUZZLE.name());
    System.out.println(ToyType.FUR.getCode() + " - " + ToyType.FUR.name());


    Scanner scanner = new Scanner(System.in);
    int selected = scanner.nextInt();
    if (selected > 4 || selected < 1) {
      System.out.println("Неизвестная категория");
      return;
    }

    System.out.println("Введите наименование товара:");
    String productName = scanner.next();
    basket.putToy(new ProductsToys(ToyType.byCode(String.valueOf(selected)), productName));
  }
}
