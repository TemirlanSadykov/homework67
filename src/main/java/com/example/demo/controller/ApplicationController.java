package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.model.Store;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ApplicationController {

    @Autowired
    private MainService service;

    @GetMapping("/")
    public String getMain(Model model){
        return "main";
    }

    @PostMapping("/findProductByName")
    public List<Product> findProductByName(@RequestParam("inputFindProductByName") String name){
        return service.findProductByName(name);
    }
    @PostMapping("/findProductByType")
    public List<Product> findProductByType(@RequestParam("inputFindProductByType") String type){
        return service.findProductByType(type);
    }
    @PostMapping("/findProductByPrice")
    public List<Product> findProductByPrice(@RequestParam("inputFindProductByPrice") float price){
        return service.findProductByPrice(price);
    }
    @PostMapping("/findProductByQuantity")
    public List<Product> findProductByQuantity(@RequestParam("inputFindProductByQuantity") int quantity){
        return service.findProductByQuantity(quantity);
    }
    @PostMapping("/findStoreByName")
    public List<Store> findStoreByName(@RequestParam("inputFindStoreByName") String name){
        return service.findStoreByName(name);
    }
    @PostMapping("/findStoreByAddress")
    public List<Store> findStoreByAddress(@RequestParam("inputFindStoreByAddress") String address){
        return service.findStoreByAddress(address);
    }
    @PostMapping("/findStoreByDescription")
    public List<Store> findStoreByDescription(@RequestParam("inputFindStoreByDescription") String description){
        return service.findStoreByDescription(description);
    }
}
