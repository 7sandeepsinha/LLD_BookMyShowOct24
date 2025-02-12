package dev.sandeep.BookMyShowOct24.service;

import dev.sandeep.BookMyShowOct24.exception.CityNotFoundException;
import dev.sandeep.BookMyShowOct24.model.City;
import dev.sandeep.BookMyShowOct24.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City createCity(City city) {
        return cityRepository.save(city);
    }

    public City getCityById(int id) {
        return cityRepository.findById(id).orElseThrow(
                () -> new CityNotFoundException("City with id " + id + " not found")
        );
    }

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public void deleteCityById(int id) {
        cityRepository.deleteById(id);
    }
}
