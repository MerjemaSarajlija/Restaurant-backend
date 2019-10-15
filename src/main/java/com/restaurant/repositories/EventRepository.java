package com.restaurant.repositories;


import com.restaurant.models.EventsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventsModel, String> {
}
