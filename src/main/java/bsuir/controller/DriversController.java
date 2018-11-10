package bsuir.controller;

import bsuir.model.DriverEntity;
import bsuir.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class DriversController {

    private DriverService driverService;

    @RequestMapping("/drivers")
    public List<DriverEntity> getDrivers() {
        return driverService.getAllDrivers();
    }

    @RequestMapping(value = "/drivers/status")
    public void changeStatus(@RequestBody DriverEntity driver) {
        driverService.changeStatus(driver);
    }

    @RequestMapping(value = "/drivers/delete/{id}")
    public void deleteDriver(@PathVariable Long id) {
        driverService.deleteDriver(id);
    }

    @RequestMapping(value = "/drivers/save-driver")
    public void saveDriver(@RequestBody DriverEntity driver) {
        driverService.saveDriver(driver);
    }

    @RequestMapping(value = "/drivers/edit-driver")
    public void editDriver(@RequestBody DriverEntity driver) {
        driverService.editDriver(driver);
    }

    @Autowired
    public void setDriverService(DriverService driverService) {
        this.driverService = driverService;
    }

}
