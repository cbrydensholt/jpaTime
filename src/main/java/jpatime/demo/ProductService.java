package jpatime.demo;

import jpatime.demo.Models.Product;
import jpatime.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


public Product findProductById(int id){

    Optional<Product> ourProduct = productRepository.findById(id);

    if (!ourProduct.isPresent()){
        throw new RuntimeException("Product not found");
    }

    return ourProduct.get();

}

public Set<Product> findAllProducts(){

    Set<Product> products = new HashSet<>();

    for(Product p: productRepository.findAll()){

        products.add(p);

    }

    return products;

}

public void createProduct(Product product){

    productRepository.save(product); //uden defineret ID

}

public void updateProduct(Product product){

    productRepository.save(product);


}

public void deleteProduct(int id){

    productRepository.deleteById(id);


}



}
