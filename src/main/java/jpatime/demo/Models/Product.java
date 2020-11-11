package jpatime.demo.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
     String productName;

    @Column(nullable = false)
    int price;

    @Column(nullable = false)
    String description;

    @ManyToOne
    private Company company;

    @ManyToMany
    private Set<Category> categories;

    public Product(String productName, int price, String description, Company company, Set<Category> categories) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.company = company;
        this.categories = categories;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
