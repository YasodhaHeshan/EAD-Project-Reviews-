package com.example.EAD_Project.Reviews.repository;

import com.example.EAD_Project.Reviews.data.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, String> {
    List<Reviews> findByHotelId(String hotelId);
    List<Reviews> findByUserId(String userId);
} 