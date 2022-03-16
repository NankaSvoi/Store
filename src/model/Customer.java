package model;

public class Customer {
  private String name;
  private Integer age;
  private final Basket basket;

  public Customer(String name, Integer age) {
    this.basket = new Basket();
    this.name = name;
    this.age = age;
  }

  /**
   * Возвращает имя покупателя
   * @return {@code String} имя
   */
  public String getName() {
    return name;
  }

  /**
   * @TODO
   * @return
   */
  public Integer getAge() {
    return age;
  }

  public Basket getBasket() {
    return basket;
  }
}
