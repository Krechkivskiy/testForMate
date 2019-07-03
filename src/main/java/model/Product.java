package model;


import java.util.Objects;

public class Product {
    private Long id;
    private String name;
    private String descriptional;
    private double price;

    public Product() {
    }

    public Product(String name, String descriptional, double price) {
        this.name = name;
        this.descriptional = descriptional;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptional() {
        return descriptional;
    }

    public void setDescriptional(String descriptional) {
        this.descriptional = descriptional;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(descriptional, product.descriptional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, descriptional, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descriptional='" + descriptional + '\'' +
                ", price=" + price +
                '}';
    }
}
