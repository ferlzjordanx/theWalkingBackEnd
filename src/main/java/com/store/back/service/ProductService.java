package com.store.back.service;

import com.store.back.dao.ProductCategoryDao;
import com.store.back.dao.ProductDao;
import com.store.back.entities.Product;
import com.store.back.entities.ProductCategory;

import java.util.List;
import java.util.Optional;

public class ProductService {

    ProductDao pdao;

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
