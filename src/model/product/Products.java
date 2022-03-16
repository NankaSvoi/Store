package model.product;

public abstract class Products {
//    const TOY_CAR = "car";

    private ToyType type;
    private String name;
    private String manufacturer;
    private String barcode;
    private int price;


    public Products(ToyType type, String name, String manufacturer, String barcode, int price) {
        this.type = type;
        this.name = name;
        this.manufacturer = manufacturer;
        this.barcode = barcode;
        this.price = price;
    }

    public Products(ToyType type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
            return manufacturer;
        }

    public int getPrice() {
            return price;
        }

    public String getBarcode() {
        return barcode;
    }


}

