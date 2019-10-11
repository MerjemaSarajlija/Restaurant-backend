package com.restaurant.repositories;

import com.restaurant.models.FOOD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodRepository extends JpaRepository<FOOD, String> {

}
