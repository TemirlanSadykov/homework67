package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.model.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface ProductRepo  extends PagingAndSortingRepository<Product, Integer> {
    public List<Product> findByName(String name);
    public List<Product> findByType(String type);
    public List<Product> findByPrice(float price);
    public List<Product> findByQuantity(int Quantity);
}
