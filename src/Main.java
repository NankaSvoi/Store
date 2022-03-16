import model.Basket;
import model.ProductsToys;

import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {

//    ProductDoll barbie = new ProductDoll("Кукла Барби", "Китай", 200);
    ProductsToys toyCar = new ProductsToys("car","Машинка", "Китай", "111", 350,"зеленый");
    ProductsToys toyDoll = new ProductsToys("doll", "Кукла", "Китай", "222", 500,"розовый");
    ProductsToys toyGf = new ProductsToys("fur", "Детская мебель", "Китай", "333", 800,"белый");
    ProductsToys toyPuzzle = new ProductsToys("Puzzle", "Puzzle", "Китай", "444", 50,"черный");
    Basket basket = new Basket();

    basket.putToy(toyCar);
    basket.putToy(toyDoll);
    basket.putToy(toyDoll);
    basket.putToy(toyPuzzle);

    basket.removeToy(toyCar);
    basket.removeToy(toyDoll);

    System.out.println("всего товаров : " + basket.getToysCount());


  }
}