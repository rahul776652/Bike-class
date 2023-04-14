package com.example.bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bikes")
public class BikeController {
    @Autowired
    private BikeService bikeService;

    @GetMapping("/")
    public ResponseEntity<List<Bike>> getAllBikes() {
        List<Bike> bikes = bikeService.getAllBikes();
        return new ResponseEntity<>(bikes, HttpStatus.OK);
    }

    @GetMapping("/{bikeId}")
    public ResponseEntity<Bike> getBikeById(@PathVariable String bikeId) {
        Optional<Bike> bike = bikeService.getBikeById(bikeId);
        return bike.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/")
    public ResponseEntity<Void> addBike(@RequestBody Bike bike) {
        bikeService.addBike(bike);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{bikeId}")
    public ResponseEntity<Void> deleteBike(@PathVariable String bikeId) {
        bikeService.deleteBike(bikeId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{bikeId}")
    public ResponseEntity<Void> updateBike(@PathVariable String bikeId, @RequestBody Bike bike) {
        bike.setBikeId(bikeId);
        bikeService.updateBike(bike);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

