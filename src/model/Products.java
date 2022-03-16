package model;

public abstract class Products {
//    const TOY_CAR = "car";

    private String type;
    private String name;
    private String manufacturer;
    private String barcode;
    private  int price;


    public Products(String type, String name, String manufacturer, String barcode, int price) {
        this.type = type;
        this.name = name;
        this.manufacturer = manufacturer;
        this.barcode = barcode;
        this.price = price;

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

