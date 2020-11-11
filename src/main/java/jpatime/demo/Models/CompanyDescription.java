package jpatime.demo.Models;

import javax.persistence.*;

@Entity
public class CompanyDescription {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String description;

    @OneToOne(mappedBy = "companyDescription")
    private Company company;

    public CompanyDescription() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public CompanyDescription(String description, Company company) {
        this.description = description;
        this.company = company;
    }
}
