package jpatime.demo.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String name;

    @ManyToMany(mappedBy = "categories")
    private Set<Product> products;

    public int getId() {
        return id;
    }

    public Category() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Category(String name, Set<Product> products) {
        this.name = name;
        this.products = products;
    }
}
