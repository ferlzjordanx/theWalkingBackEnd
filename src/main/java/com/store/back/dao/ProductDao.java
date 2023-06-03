package com.store.back.dao;

import com.store.back.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long> {
    public List<Product> findProductByCategoryId(Long id);

}
