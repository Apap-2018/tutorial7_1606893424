package com.apap.tutorial7.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
    FlightModel addFlight(FlightModel flight);
    
    void deleteByFlightNumber(String flightNumber);
    
    void deleteByFlightId(long flightId);

    Optional<FlightModel> getFlightDetailByFlightNumber(String flightNumber);
    Optional<FlightModel> getFlightDetailByFlightId(long flightId);
    
    List<FlightModel> getAll();
}