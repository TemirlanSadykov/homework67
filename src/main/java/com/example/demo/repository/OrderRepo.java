package com.example.demo.repository;

import com.example.demo.model.Order;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepo extends PagingAndSortingRepository<Order, Integer> {
}
