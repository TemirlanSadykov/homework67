package com.example.demo.repository;

import com.example.demo.model.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface StoreRepo extends PagingAndSortingRepository<Store, Integer> {
    public List<Store> findByName(String name);
    public List<Store> findByDescription(String name);
    public List<Store> findByAddress(String name);
}
