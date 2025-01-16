//package com.amit.demoForLearning.controller;
//
//
//import com.amit.demoForLearning.entities.Driver;
//import com.amit.demoForLearning.repository.DriverRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/drivers")
//@RequiredArgsConstructor
//public class DriverController {
//
//    private final DriverRepository driverRepository;
//
//    @GetMapping
//    public String message(){
//        return "Hi this new company";
//    }
//
//    @PostMapping("/postsDetails")
//    public ResponseEntity<Driver> detailsOfDriver(@RequestBody Driver driver){
//        Driver d=driverRepository.save(driver);
//
//        return ResponseEntity.ok(d);
//    }
//}
