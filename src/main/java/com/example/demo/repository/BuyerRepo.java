package com.example.demo.repository;

import com.example.demo.model.Buyer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BuyerRepo extends PagingAndSortingRepository<Buyer, Integer> {
}
