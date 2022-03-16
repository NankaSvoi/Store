package model;

public class ProductsToys extends Products {

    private String color;

    public ProductsToys(String type, String name, String manufacturer, String barcode, int price, String color) {
        super(type, name, manufacturer, barcode, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "О товаре: " + getName() +", производство " +getManufacturer() + ", цена " + getPrice() + " рублей" + ", штрихкод" + getBarcode() + ", цвет " +getColor();
    }
}
