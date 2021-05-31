import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String manufacture;
    private long price;

    public Product(String id, String name, String manufacture, long price) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                '}';
    }
}
