package jpatime.demo.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Company {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String name;

    @OneToOne
    private CompanyDescription companyDescription;

    @OneToMany(mappedBy = "company")
    private Set<Product> products;

    public Company(String name, CompanyDescription companyDescription, Set<Product> products) {
        this.name = name;
        this.companyDescription = companyDescription;
        this.products = products;
    }

    public Company() {
    }

    public int getId() {
        return id;
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

    public CompanyDescription getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(CompanyDescription companyDescription) {
        this.companyDescription = companyDescription;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
