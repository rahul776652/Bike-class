package com.example.bike;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRepository  extends JpaRepository<Bike, String> {

    @Query("SELECT s FROM Bike s WHERE s.model = ?1")
    List<Bike> findByModel(String model);

}
