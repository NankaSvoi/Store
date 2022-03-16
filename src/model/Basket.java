package model;
import java.util.LinkedList;

public class Basket {

    private LinkedList<ProductsToys> productsList;   //список игрушек в корзине

    public Basket() {
        this.productsList = new LinkedList<>();   // объект списка товаров

    }
    // добавить товар в корзину
    public void putToy(ProductsToys toy) {
        System.out.println("товар положен в корзину: " + toy.getName());
        this.productsList.add(toy);

    }
    // удалить товар из корзины
    public void removeToy(ProductsToys toy) {
        System.out.println("товар удален: " + toy.getName());
         this.productsList.remove(toy);

    }

    // показать количество товаров в корзине
    public Integer getToysCount() {
        Integer count = this.productsList.size();

        return count;
    }


}
