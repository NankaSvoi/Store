package model.product;

public class ProductsToys extends Products {

    private String color;

    public ProductsToys(ToyType type, String name, String manufacturer, String barcode, int price, String color) {
        super(type, name, manufacturer, barcode, price);
        this.color = color;
    }

    public ProductsToys(ToyType type, String name) {
        super(type, name);
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "О товаре: " + getName() +", производство " +getManufacturer() + ", цена " + getPrice() + " рублей" + ", штрихкод" + getBarcode() + ", цвет " +getColor();
    }
}
