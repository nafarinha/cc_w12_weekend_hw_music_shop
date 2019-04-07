package accessories;
import products.Product;

public class Accessory extends Product {

    private String make;
    private String model;
    private String type;

    public Accessory(String make, String model, String type) {
        this.make = make;
        this.model = model;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

}
