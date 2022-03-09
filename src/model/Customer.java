package model;

public class Customer {
  private String name;
  private Integer age;

  public Customer(String name, Integer age) {
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
}
