package com.store.back.controller;

import com.store.back.entities.Product;
import com.store.back.entities.ProductCategory;
import com.store.back.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin@RequestMapping("/api/products")
public class ProductController {

    ProductService ps;

    @GetMapping("/find/{id}")
    public Product findById(@PathVariable("id") long id) {
        Product p=new Product();
        Optional<Product> op=ps.find(id);
        if(op.isPresent()) {
            p=op.get();
        }
        return p;
    }
    @GetMapping("/findByCategory")
    public List<Product> findByCategoryId(@RequestParam("id") long cid){
        return ps.findAll(cid);
    }
    @GetMapping("/category/all")
    public List<ProductCategory> ListCategory(){
        return ps.findAll();
    }


}
