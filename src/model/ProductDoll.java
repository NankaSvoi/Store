package model;

public class ProductDoll extends Products {


    public ProductDoll(String type, String name, String manufacturer,  String barcode, int price) {
        super(type, name, manufacturer, barcode, price);
    }

//    public void putInBasket () {
//        System.out.println("продукт положен в корзину"); }

    public String toString() {
        return "О товаре: " + getName() + ", производство " +getManufacturer() + ", цена " + getPrice() + " рублей.";
    }
}

