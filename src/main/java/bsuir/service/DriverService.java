package bsuir.service;

import bsuir.model.DriverEntity;

import java.util.List;

public interface DriverService {
    List<DriverEntity> getAllDrivers();
    void changeStatus(DriverEntity driver);
    void deleteDriver(Long id);
    void saveDriver(DriverEntity driver);
    void editDriver(DriverEntity driver);
}
