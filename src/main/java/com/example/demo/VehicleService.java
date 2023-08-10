
package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllVehicle() {
        List<Vehicle> vehicle = new ArrayList<>();
        vehicleRepository.findAll().forEach(vehicle::add);
        return vehicle;
    }

    public Vehicle getVehicleById(Integer id) {
        return vehicleRepository.findById(id).orElse(null);
    }
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(Vehicle updatedVehicle) {
        return vehicleRepository.save(updatedVehicle);
    }

    public boolean deleteVehicleById(Integer id) {
        if (vehicleRepository.existsById(id)) {
        	vehicleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

