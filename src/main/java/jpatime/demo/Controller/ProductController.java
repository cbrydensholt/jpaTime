package jpatime.demo.Controller;

import jpatime.demo.Models.Product;
import jpatime.demo.Repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String index(){



        return "index";
    }


    @GetMapping("/saveRecipe")
    public String saverecipe(){




        return "index";
    }

    @GetMapping("/findall")
    public String findallrecipes(Model model){

        model.addAttribute("products", productRepository.findAll());
        for(Product r: productRepository.findAll()){
            System.out.println(r);

        }


        return "findall";

    }

    @GetMapping("/deleteall")
    public String deleteallrecipes(){

        productRepository.deleteAll();

        return "index";

    }

    @GetMapping("/deleteproduct")
    public String deleteproduct(@RequestParam int productid){

        productRepository.deleteById(productid);

       return "redirect:/findall";
    }

}
