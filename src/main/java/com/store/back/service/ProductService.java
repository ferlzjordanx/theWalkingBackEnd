package com.store.back.service;

import com.store.back.dao.ProductCategoryDao;
import com.store.back.dao.ProductDao;
import com.store.back.entities.Product;
import com.store.back.entities.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductDao pdao;
    @Autowired
    ProductCategoryDao pcdao;

    public Optional<Product> find(long id){
        return pdao.findById(id);
    }

    public List<Product> findAll(long id){
        return pdao.findProductByCategoryId(id);
    }

    public List<ProductCategory> findAll(){
        return pcdao.findAll();
    }

}
