package com.example.bike;
import jakarta.transaction.Transactional;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BikeService {

    public static  BikeRepository bikeRepository;
    @Autowired
    public BikeService(BikeRepository bikeRepository){
        BikeService.bikeRepository = bikeRepository;
    }



    public static List<Bike> getAllBikes() {
        return bikeRepository.findAll();
    }

    public Optional<Bike> getBikeById(String bikeId) {
        return bikeRepository.findById(bikeId);
    }

    public void addBike(Bike bike) {
        bikeRepository.save(bike);
    }

    public void deleteBike(String bikeId) {
        bikeRepository.deleteById(bikeId);
    }
      @Transactional
    public void updateBike(@NotNull Bike bike) {
        Optional<Bike> existingBike = bikeRepository.findById(bike.getBikeId());
        if (existingBike.isPresent()) {
            Bike updatedBike = existingBike.get();
            updatedBike.setName(bike.getName());
            updatedBike.setModel(bike.getModel());
            updatedBike.setYear(bike.getYear());
            updatedBike.setTopSpeed(bike.getTopSpeed());
            updatedBike.setBikeMileage(bike.getBikeMileage());
            bikeRepository.save(updatedBike);
        }
    }
}

