package com.example.demo.service;

import com.example.demo.model.Buyer;
import com.example.demo.model.Order;
import com.example.demo.model.Product;
import com.example.demo.model.Store;
import com.example.demo.repository.BuyerRepo;
import com.example.demo.repository.OrderRepo;
import com.example.demo.repository.ProductRepo;
import com.example.demo.repository.StoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private BuyerRepo buyerRepo;

    @Autowired
    private StoreRepo storeRepo;

    @Autowired
    private ProductRepo productRepo;

    public Order makeNewOrder(String buyerEmail, String storeName, String productName){
        return orderRepo.save(new Order(buyerEmail, storeName, productName));
    }

    public List<Store> findStoreByName(String name){
        return storeRepo.findByName(name);
    }
    public List<Store> findStoreByAddress(String address){
        return storeRepo.findByAddress(address);
    }
    public List<Store> findStoreByDescription(String description){
        return storeRepo.findByDescription(description);
    }

    public List<Product> findProductByName(String name){
        return productRepo.findByName(name);
    }
    public List<Product> findProductByType(String type){
        return productRepo.findByType(type);
    }
    public List<Product> findProductByPrice(float price){
        return productRepo.findByPrice(price);
    }
    public List<Product> findProductByQuantity(int quantity){
        return productRepo.findByQuantity(quantity);
    }

}
